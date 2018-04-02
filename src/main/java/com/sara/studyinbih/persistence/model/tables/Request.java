package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * The type Request.
 */
@Entity
@Table(name = "request")
public class Request extends BaseModel {
	private static final String DATE_PATTERN = "EEEE, MMM dd, yyyy";
	private static final String TIME_PATTERN = "h:mm a";

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "studyProgram_id", referencedColumnName = "id")
	private StudyProgram studyProgram;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@Column(name = "start_time")
	private Timestamp startTime;

	@Column(name = "reserved_on")
	private Timestamp reservedOn;

	@Column(name = "is_confirmed")
	private Boolean isConfirmed = false;

	@Transient
	private String date;

	@Transient
	private String time;

	/**
	 * Instantiates a new Request.
	 */
	public Request() { }

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public UUID getId() { return id; }

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(UUID id) { this.id = id; }

	/**
	 * Gets studyProgram.
	 *
	 * @return the studyProgram
	 */
	public StudyProgram getRoom() { return studyProgram; }

	/**
	 * Sets studyProgram.
	 *
	 * @param studyProgram the studyProgram
	 */
	public void setRoom(StudyProgram studyProgram) { this.studyProgram = studyProgram; }

	/**
	 * Gets user.
	 *
	 * @return the user
	 */
	public User getUser() { return user; }

	/**
	 * Sets user.
	 *
	 * @param user the user
	 */
	public void setUser(User user) { this.user = user; }

	/**
	 * Gets start time.
	 *
	 * @return the start time
	 */
	public Timestamp getStartTime() { return startTime; }

	/**
	 * Sets start time.
	 *
	 * @param startTime the start time
	 */
	public void setStartTime(Long startTime) { this.startTime = new Timestamp(startTime); }

	/**
	 * Gets reserved on.
	 *
	 * @return the reserved on
	 */
	public Timestamp getReservedOn() { return reservedOn; }

	/**
	 * Sets reserved on.
	 *
	 * @param reservedOn the reserved on
	 */
	public void setReservedOn(Long reservedOn) { this.reservedOn = new Timestamp(reservedOn); }

	/**
	 * Gets confirmed.
	 *
	 * @return the confirmed
	 */
	public Boolean getConfirmed() { return isConfirmed; }

	/**
	 * Sets confirmed.
	 *
	 * @param confirmed the confirmed
	 */
	public void setConfirmed(Boolean confirmed) { isConfirmed = confirmed; }

	/**
	 * Gets date.
	 *
	 * @return the date
	 */
	public String getDate() {
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		return df.format(this.startTime.getTime());
	}

	/**
	 * Sets date.
	 *
	 * @param date the date
	 */
	public void setDate(String date) { this.date = date; }

	/**
	 * Gets time.
	 *
	 * @return the time
	 */
	public String getTime() {
		DateFormat df = new SimpleDateFormat(TIME_PATTERN);
		return df.format(this.startTime.getTime());
	}

	/**
	 * Sets time.
	 *
	 * @param time the time
	 */
	public void setTime(String time) { this.time = time; }
}