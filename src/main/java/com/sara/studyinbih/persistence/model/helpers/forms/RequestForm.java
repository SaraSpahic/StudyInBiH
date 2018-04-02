package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * The type Request form.
 */
public class RequestForm extends BaseModel {

	private UUID universityId;
	private Integer numberOfPeople;
	private Date date;
	private Time time;

	/**
	 * Instantiates a new Request form.
	 */
	public RequestForm() {}

	/**
	 * Gets university id.
	 *
	 * @return the university id
	 */
	public UUID getUniversityId() { return this.universityId; }

	/**
	 * Sets university id.
	 *
	 * @param universityId the university id
	 */
	public void setUniversityId(UUID universityId) { this.universityId = universityId; }

	/**
	 * Gets number of people.
	 *
	 * @return the number of people
	 */
	public Integer getNumberOfPeople() { return this.numberOfPeople; }

	/**
	 * Sets number of people.
	 *
	 * @param numberOfPeople the number of people
	 */
	public void setNumberOfPeople(Integer numberOfPeople) { this.numberOfPeople = numberOfPeople; }

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public Date getDate() { return this.date; }

	/**
	 * Sets date.
	 *
	 * @param date the date
	 * @throws ParseException the parse exception
	 */
	public void setDate(String date) throws ParseException {
		this.date = Date.valueOf(date);
	}

	/**
	 * Gets time.
	 *
	 * @return the time
	 */
	public Time getTime() { return this.time; }

	/**
	 * Sets time.
	 *
	 * @param time the time
	 * @throws ParseException the parse exception
	 */
	public void setTime(String time) throws ParseException {
		DateFormat timeFormat = new SimpleDateFormat(time.length() == 5 ? "HH:mm" : "HH:mm:ss");
		this.time = new Time(timeFormat.parse(time).getTime());
	}
}
