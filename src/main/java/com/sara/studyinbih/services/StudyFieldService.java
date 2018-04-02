package com.sara.studyinbih.services;


import com.sara.studyinbih.persistence.model.tables.StudyField;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The type StudyField service.
 */
@Service
public class StudyFieldService extends BaseService {

	private static final String ORDER_KEY = "name";


	/**
	 * Gets all studyFields.
	 *
	 * @return the all studyFields
	 */
	@SuppressWarnings("unchecked")
	public List<StudyField> getAllStudyFields() {
		return (List<StudyField>) getSession().createCriteria(StudyField.class)
				.addOrder(Order.asc(ORDER_KEY))
				.list();
	}

	/**
	 * Gets all studyFields as string.
	 *
	 * @return the all studyFields as string
	 */
	public List<String> getAllStudyFieldsAsString() {
		return this.getAllStudyFields().stream()
				.map(StudyField::getName)
				.collect(Collectors.toList());
	}

	/**
	 * Gets studyField.
	 *
	 * @param id the id
	 * @return the studyField
	 */
	public StudyField getStudyField(final UUID id) {
		return (StudyField) getSession().createCriteria(StudyField.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();
	}

	/**
	 * Create studyField boolean.
	 *
	 * @param studyField the studyField
	 * @return the boolean
	 */
	public Boolean createStudyField(final StudyField studyField) {
		getSession().save(studyField);
		return true;
	}

	/**
	 * Edit studyField boolean.
	 *
	 * @param studyField the studyField
	 * @return the boolean
	 */
	public Boolean editStudyField(final StudyField studyField) {
		getSession().update(studyField);
		return true;
	}

	/**
	 * Delete studyField boolean.
	 *
	 * @param id the id
	 * @return the boolean
	 */
	public Boolean deleteStudyField(final UUID id) {
		StudyField studyField = (StudyField) getSession().createCriteria(StudyField.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();

		getSession().delete(studyField);
		return true;
	}
}
