package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.helpers.forms.RequestConfirmationForm;
import com.sara.studyinbih.persistence.model.helpers.forms.RequestForm;
import com.sara.studyinbih.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * The type Request controller.
 */
@Controller
public class RequestController extends BaseController {

	@Autowired
	private RequestService service;

	/**
	 * Gets request.
	 *
	 * @param requestId the id
	 * @return the request
	 */
	@RequestMapping(value = "/api/v1/getRequest/{requestId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getRequest(@PathVariable final String requestId) {
		return wrapForPublic(() -> this.service.getRequest(UUID.fromString(requestId)));
	}

	/**
	 * Post request inquiry result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/postRequestInquiry", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity postRequestInquiry(@RequestBody RequestForm requestForm) {
		return wrapForPublic(() -> this.service.processInquiry(requestForm));
	}

	/**
	 * Post request result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/postRequest", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity postRequest(@RequestBody RequestForm requestForm) {
		return wrapForPublic(() -> this.service.postRequest(requestForm));
	}

	/**
	 * Confirm request result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/confirmRequest", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity confirmRequest(@RequestBody RequestConfirmationForm requestConfirmationForm,
                                             HttpSession session) {
		return wrapForUser(() -> this.service.confirmRequest(requestConfirmationForm), session);
	}

	/**
	 * Gets my requests.
	 *
	 * @return the my requests
	 */
    @RequestMapping(value = "/api/v1/getMyRequests", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getMyRequests(HttpSession session) {
		return wrapForUser(() -> this.service.
                getMyRequests(this.userCache.get((String) session.getAttribute("uid"))), session);
	}

	/**
	 * Gets all requests.
	 *
	 * @param universityId the university id
	 * @param dateFilter   the date filter
	 * @return the all requests
	 */

    @RequestMapping(value = "/api/v1/admin/getAllRequests/{rId}/{date}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllRequests(@PathVariable("rId") String universityId,
                                             @PathVariable("date") String dateFilter,
                                             HttpSession session) {
		return wrapForAdmin(() -> this.service.getAllRequests(UUID.fromString(universityId), dateFilter),session);
	}
}
