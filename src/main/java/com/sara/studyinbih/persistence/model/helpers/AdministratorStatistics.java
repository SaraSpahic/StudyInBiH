package com.sara.studyinbih.persistence.model.helpers;

/**
 * The type Administrator statistics.
 */
public class AdministratorStatistics {


	private Long numberOfUniversities;
	private Long numberOfUsers;
	private Long numberOfLocations;
	private Long numberOfStudyFields;

	private AdministratorStatistics() {}

	public static AdministratorStatistics createAdminStatistics()  { return  new AdministratorStatistics(); }

	/**
	 *
	 * @return the number of universities
	 */
	public Long getNumberOfUniversities() {
		return numberOfUniversities;
	}

	/**
	 *
	 * @param numberOfUniversities the number of Universities
	 * @return The number of universities
	 */
	public AdministratorStatistics setNumberOfUniversities(Long numberOfUniversities) {
		this.numberOfUniversities = numberOfUniversities;
		return this;
	}

	/**
	 *
	 * @return the number of Users
	 */
	public Long getNumberOfUsers() {
		return numberOfUsers;
	}

	/**
	 *
	 * @param numberOfUsers the number of Users
	 * @return the number of users
	 */
	public AdministratorStatistics setNumberOfUsers(Long numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
		return this;
	}

	/**
	 *
	 * @return the number of locations
	 */
	public Long getNumberOfLocations() {
		return numberOfLocations;
	}

	/**
	 *
	 * @param numberOfLocations
	 * @return the number of locations
	 */
	public AdministratorStatistics setNumberOfLocations(Long numberOfLocations) {
		this.numberOfLocations = numberOfLocations;
		return this;
	}

	/**
	 *
	 * @return the number of StudyFields
	 */
	public Long getNumberOfStudyFields() {
		return numberOfStudyFields;
	}

	/**
	 * @param numberOfStudyFields
	 * @return the numberOfStudyFields
	 */
	public AdministratorStatistics setNumberOfStudyFields(Long numberOfStudyFields) {
		this.numberOfStudyFields = numberOfStudyFields;
		return this;
	}
}
