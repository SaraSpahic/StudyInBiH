package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.persistence.model.tables.Request;

/**
 * The type Request confirmation form.
 */
public class RequestConfirmationForm extends BaseModel {

	private Request request;

	/**
	 * Instantiates a new Request confirmation form.
	 */
	public RequestConfirmationForm() { }

	/**
	 * Gets request.
	 *
	 * @return the request
	 */
	public Request getRequest() { return request; }

	/**
	 * Sets request.
	 *
	 * @param request the request
	 */
	public void setRequest(Request request) { this.request = request; }
}
