package com.sara.studyinbih.persistence.model.helpers;


import com.sara.studyinbih.persistence.model.helpers.forms.RequestForm;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Request inquiry response.
 */
public class RequestInquiryResponse {

	private static final String DATE_PATTERN = "HH:mm:ss";

	private RequestForm inquiry;
	private Long numberOfStudyProgramsLeft;
	private Long numberOfRequestsToday;
	private List<Time> timeSuggestions;

	private final SimpleDateFormat df = new SimpleDateFormat(DATE_PATTERN);

	private  RequestInquiryResponse() {}

	/**
	 * Gets object.
	 *
	 * @return the object
	 */
	public static RequestInquiryResponse getObject() {
		return new RequestInquiryResponse();
	}

	/**
	 * Gets inquiry.
	 *
	 * @return the inquiry
	 */
	public RequestForm getInquiry() { return this.inquiry; }

	/**
	 * Sets inquiry.
	 *
	 * @param inquiry the inquiry
	 * @return the inquiry
	 */
	public RequestInquiryResponse setInquiry(RequestForm inquiry) {
		this.inquiry = inquiry;
		return this;
	}

	/**
	 * Gets number of studyPrograms left.
	 *
	 * @return the number of studyPrograms left
	 */
	public Long getNumberOfStudyProgramsLeft() { return this.numberOfStudyProgramsLeft; }

	/**
	 * Sets number of studyPrograms left.
	 *
	 * @param numberOfStudyProgramsLeft the number of studyPrograms left
	 * @return the number of studyPrograms left
	 */
	public RequestInquiryResponse setNumberOfStudyProgramsLeft(Long numberOfStudyProgramsLeft) {
		this.numberOfStudyProgramsLeft = numberOfStudyProgramsLeft;
		return this;
	}

	/**
	 * Gets number of requests today.
	 *
	 * @return the number of requests today
	 */
	public Long getNumberOfRequestsToday() { return this.numberOfRequestsToday; }

	/**
	 * Sets number of requests today.
	 *
	 * @param numberOfRequestsToday the number of requests today
	 * @return the number of requests today
	 */
	public RequestInquiryResponse setNumberOfRequestsToday(Long numberOfRequestsToday) {
		this.numberOfRequestsToday = numberOfRequestsToday;
		return this;
	}

	/**
	 * Gets time suggestions.
	 *
	 * @return the time suggestions
	 */
	public List<Time> getTimeSuggestions() { return this.timeSuggestions; }

	public RequestInquiryResponse setTimeSuggestions(Time timeSuggestion) {
		this.setTimeSuggestions(Arrays.asList(timeSuggestion));
		return this;
	}

	/**
	 * Sets time suggestions.
	 *
	 * @param timeSuggestions the time suggestions
	 * @return the time suggestions
	 */
	@SuppressWarnings("unchecked")
	public RequestInquiryResponse setTimeSuggestions(final List<?> timeSuggestions) {
		if (!timeSuggestions.isEmpty()) {
			if (timeSuggestions.get(0) instanceof Time) {
				this.setTimeSuggestionsFromTime((List<Time>) timeSuggestions);
			} else if (timeSuggestions.get(0) instanceof String) {
				this.setTimeSuggestionsFromString((List<String>) timeSuggestions);
			}
		}
		return this;
	}

	private void setTimeSuggestionsFromTime(final List<Time> timeSuggestions) {
		this.timeSuggestions = timeSuggestions;
	}

	private void setTimeSuggestionsFromString(final List<String> timeSuggestions) {
		this.timeSuggestions = timeSuggestions.stream().map(this::timeFromString).collect(Collectors.toList());
	}

	private Time timeFromString(final String timeString) {
		try {
			return new Time(df.parse(timeString).getTime());
		} catch (ParseException e) {
			return null;
		}
	}
}
