package com.sara.studyinbih.persistence.model.helpers;


/**
 * The type Popular location.
 */
public class PopularLocation {
	private Object city;
	private Object numberOfUniversities;
	private Boolean isPlural;

	/**
	 * Instantiates a new Popular location.
	 *
	 * @param popularLocation the popular location
	 */
	public PopularLocation(Object[] popularLocation) {
		this.city = popularLocation[0];
		this.numberOfUniversities = popularLocation[1];
	}

	/**
	 * Gets city.
	 *
	 * @return the city
	 */
	public Object getCity() { return city; }

	/**
	 * Sets city.
	 *
	 * @param city the city
	 */
	public void setCity(Object city) { this.city = city; }

	/**
	 * Gets number of universities.
	 *
	 * @return the number of universities
	 */
	public Long getNumberOfUniversities() {
		return Long.parseLong(this.numberOfUniversities.toString());
	}

	/**
	 * Gets is plural.
	 *
	 * @return the is plural
	 */
	public Boolean getIsPlural() {
		return ((Long) this.numberOfUniversities) > 1;
	}

	/**
	 * Sets plural.
	 *
	 * @param plural the plural
	 */
	public void setPlural(Boolean plural) { this.isPlural = plural; }
}
