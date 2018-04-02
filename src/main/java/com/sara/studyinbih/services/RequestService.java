package com.sara.studyinbih.services;

import com.sara.studyinbih.persistence.model.helpers.RequestInquiryResponse;
import com.sara.studyinbih.persistence.model.helpers.UserRequests;
import com.sara.studyinbih.persistence.model.helpers.forms.RequestConfirmationForm;
import com.sara.studyinbih.persistence.model.helpers.forms.RequestForm;
import com.sara.studyinbih.persistence.model.tables.Request;
import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import com.sara.studyinbih.persistence.model.tables.User;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The type Request service.
 */
@Service
public class RequestService extends BaseService {

	private static final Long ONE_HOUR_MILLIS = TimeUnit.HOURS.toMillis(1);
	private static final Long FORTY_FIVE_MINUTES_MILLIS = TimeUnit.MINUTES.toMillis(45);
	private static final Long FIFTEEN_MINUTES_MILLIS = TimeUnit.MINUTES.toMillis(15);
	private static final Long FIVE_MINUTES_MILLIS = TimeUnit.MINUTES.toMillis(5);
	private static final String DAY_START_TIME = " 00:00:00";
	private static final String DAY_END_TIME = " 23:59:59";

	/**
	 * Gets request.
	 *
	 * @param id the id
	 * @return the request
	 * @throws Exception the exception
	 */
	public Request getRequest(UUID id) throws Exception {
		return (Request) getSession()
				.createCriteria(Request.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();
	}

	/**
	 * Process inquiry request inquiry response.
	 *
	 * @param requestForm the request form
	 * @return the request inquiry response
	 * @throws Exception the exception
	 */
	public RequestInquiryResponse processInquiry(RequestForm requestForm) throws Exception {
		RequestInquiryResponse response = RequestInquiryResponse.getObject()
				.setInquiry(requestForm)
				.setNumberOfRequestsToday((Long) getSession()
						.createCriteria(Request.class)
						.createAlias("table", "t")
						.add(Restrictions.eq("t.universityId", requestForm.getUniversityId()))
						.setProjection(Projections.rowCount())
						.uniqueResult()
				);

		Timestamp desiredDateTime = new Timestamp(requestForm.getDate().getTime() + requestForm.getTime().getTime() + ONE_HOUR_MILLIS);

		List<StudyProgram> freeStudyPrograms= this.getFreeStudyPrograms(
				desiredDateTime,
				requestForm.getUniversityId(),
				requestForm.getNumberOfPeople()
		);

		response.setNumberOfStudyProgramsLeft((long) freeStudyPrograms.size());

		if (freeStudyPrograms.isEmpty()) {
			response.setTimeSuggestions(
					IntStream.rangeClosed(-6, 6).boxed()
							.map(i -> new Time(desiredDateTime.getTime() + (FIFTEEN_MINUTES_MILLIS * i)))
							.filter(timeSuggestion ->
									!getFreeStudyPrograms(
											new Timestamp(timeSuggestion.getTime()),
											requestForm.getUniversityId(),
											requestForm.getNumberOfPeople()
									).isEmpty())
							.collect(Collectors.toList())
			);
		} else {
			response.setTimeSuggestions(requestForm.getTime());
		}

		return response;
	}

	@SuppressWarnings("unchecked")
	private List<StudyProgram> getFreeStudyPrograms(Timestamp desiredTime, UUID universityId, Integer numberOfStudyPrograms) {
		Timestamp fortyFiveMinutesBefore = new Timestamp(desiredTime.getTime());
		fortyFiveMinutesBefore.setTime(fortyFiveMinutesBefore.getTime() - FORTY_FIVE_MINUTES_MILLIS);

		Timestamp oneHourAfter = new Timestamp(desiredTime.getTime());
		oneHourAfter.setTime(oneHourAfter.getTime() + ONE_HOUR_MILLIS);

		List<UUID> potentialRoomIds = getSession().createCriteria(StudyProgram.class)
				.add(Restrictions.eq("universityId", universityId))
				.add(Restrictions.between("numberOfStudyPrograms", numberOfStudyPrograms, numberOfStudyPrograms + 2))
				.setProjection(Projections.property("id"))
				.list();

		List<UUID> freeRoomIds = new ArrayList<>();

		if (potentialRoomIds.size() > 0) {
			List <Request> reservedStudyPrograms= getSession().createCriteria(Request.class)
					.add(Restrictions.between("startTime", fortyFiveMinutesBefore, oneHourAfter))
					.add(Restrictions.in("studyProgram.id", potentialRoomIds))
					.add(Restrictions.eq("isConfirmed", true))
					.list();

			freeRoomIds.addAll(potentialRoomIds.stream().filter(potentialRoomId ->
				!reservedStudyPrograms.stream()
						.map(studyProgram -> studyProgram.getRoom().getId())
						.collect(Collectors.toList())
						.contains(potentialRoomId)
			).collect(Collectors.toList()));
		}

		if (freeRoomIds.size() > 0) {
			return getSession().createCriteria(StudyProgram.class)
					.add(Restrictions.in("id", freeRoomIds))
					.list();
		} else {
			return new ArrayList<>();
		}
	}


	/**
	 * Post request request.
	 *
	 * @param requestForm the request form
	 * @return the request
	 * @throws Exception the exception
	 */
	public Request postRequest(RequestForm requestForm) throws Exception {
		Request request = new Request();
		request.setStartTime(requestForm.getDate().getTime() + requestForm.getTime().getTime() + ONE_HOUR_MILLIS);
		request.setReservedOn(System.currentTimeMillis());
		request.setConfirmed(false);

		request.setRoom(
				this.getFreeStudyPrograms(
						request.getStartTime(),
						requestForm.getUniversityId(),
						requestForm.getNumberOfPeople()
				).get(0)
		);

		getSession().save(request);

		return request;
	}

	/**
	 * Confirm request boolean.
	 *
	 * @param requestConfirmationForm the request confirmation form
	 * @return the boolean
	 * @throws Exception the exception
	 */
	public Boolean confirmRequest(RequestConfirmationForm requestConfirmationForm) throws Exception {
		getSession().saveOrUpdate(requestConfirmationForm.getRequest());
		return true;
	}

	/**
	 * Gets my requests.
	 *
	 * @param user the user
	 * @return the my requests
	 * @throws Exception the exception
	 */
	@SuppressWarnings("unchecked")
	public UserRequests getMyRequests(User user) throws Exception {
		return new UserRequests((List<Request>) getSession().createCriteria(Request.class)
				.add(Restrictions.eq("user.id", user.getId()))
				.addOrder(Order.asc("startTime"))
				.list());
	}

	/**
	 * Gets all requests.
	 *
	 * @param universityId the university id
	 * @param dateFilter   the date filter
	 * @return the all requests
	 */
	@SuppressWarnings("unchecked")
	public List<Request> getAllRequests(UUID universityId, String dateFilter) {
		Timestamp t1 = Timestamp.valueOf(dateFilter + DAY_START_TIME);
		Timestamp t2 = Timestamp.valueOf(dateFilter + DAY_END_TIME);

		return getSession().createCriteria(Request.class)
				.createAlias("table", "t")
				.add(Restrictions.eq("t.universityId", universityId))
				.add(Restrictions.between("startTime", t1, t2))
				.add(Restrictions.eq("isConfirmed", true))
				.list();
	}
}
