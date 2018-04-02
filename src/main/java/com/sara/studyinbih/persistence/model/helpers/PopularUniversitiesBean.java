package com.sara.studyinbih.persistence.model.helpers;

import java.util.UUID;

/**
 * The type Popular universities bean.
 */
public class PopularUniversitiesBean {
	private UUID universityId;
	private Long studyProgramCount;

	/**
	 * Instantiates a new Popular universities bean.
	 */
	public PopularUniversitiesBean() { }

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
	 * Gets studyProgram count.
	 *
	 * @return the studyProgram count
	 */
	public Long getRoomCount() { return this.studyProgramCount; }

	/**
	 * Sets studyProgram count.
	 *
	 * @param studyProgramCount the studyProgram count
	 */
	public void setRoomCount(Long studyProgramCount) { this.studyProgramCount = studyProgramCount; }
}
