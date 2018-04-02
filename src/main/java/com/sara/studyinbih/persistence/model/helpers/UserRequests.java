package com.sara.studyinbih.persistence.model.helpers;

import com.sara.studyinbih.persistence.model.tables.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User requests.
 */
public class UserRequests {
	private List<Request> upcoming = new ArrayList<>();
	private List<Request> past = new ArrayList<>();

	/**
	 * Instantiates a new User requests.
	 *
	 * @param allRequests the all requests
	 */
	public UserRequests(final List<Request> allRequests) {
		allRequests.forEach(request ->
				(request.getStartTime().getTime() > System.currentTimeMillis() ? this.upcoming : this.past).add(request));
	}

	/**
	 * Gets upcoming.
	 *
	 * @return the upcoming
	 */
	public List<Request> getUpcoming() {
		return this.upcoming;
	}

	/**
	 * Gets past.
	 *
	 * @return the past
	 */
	public List<Request> getPast() {
		return this.past;
	}
}
