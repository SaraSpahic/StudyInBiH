package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.tables.StudyField;
import com.sara.studyinbih.services.StudyFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * The type StudyField controller.
 */
@Controller
public class StudyFieldController extends BaseController {

	@Autowired
	private StudyFieldService service;

	/**
	 * Gets studyField.
	 *
	 * @param studyFieldId the id
	 * @return the studyField
	 */
	@RequestMapping(value = "/api/v1/getStudyField/{studyFieldId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getStudyField(@PathVariable final String studyFieldId) {
		return wrapForPublic(() -> this.service.getStudyField(UUID.fromString(studyFieldId)));
	}

	/**
	 * Create studyField result.
	 *
	 * @return the result
	 */
	@RequestMapping(value = "/api/v1/admin/createStudyField", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity createStudyField(@RequestBody StudyField studyField, HttpSession session) {
		return wrapForAdmin(() -> this.service.createStudyField(studyField), session);
	}

	/**
	 * Edit studyField result.
	 *
	 * @return the result
	 */
	@RequestMapping(value = "/api/v1/admin/editStudyField", method = RequestMethod.PUT, produces="application/json")
	public ResponseEntity editStudyField(@RequestBody StudyField studyField, HttpSession session) {
		return wrapForAdmin(() -> this.service.editStudyField(studyField), session);
	}

	/**
	 * Delete studyField result.
	 *
	 * @param studyFieldId the id
	 * @return the result
	 */
	@RequestMapping(value = "/api/v1/deleteStudyField/{studyFieldId}", method = RequestMethod.DELETE, produces="application/json")
	public ResponseEntity deleteStudyField(@PathVariable final String studyFieldId, HttpSession session) {
		return wrapForAdmin(() -> this.service.deleteStudyField(UUID.fromString(studyFieldId)), session);
	}

	/**
	 * Gets all studyFields.
	 *
	 * @return the all studyFields
	 */
	@RequestMapping(value = "/api/v1/getAllStudyFields", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllStudyFields() {
		return wrapForPublic(() -> this.service.getAllStudyFields());
	}

	/**
	 * Gets all studyFields as string.
	 *
	 * @return the all studyFields as string
	 */
	@RequestMapping(value = "/api/v1/getAllStudyFieldsAsString", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllStudyFieldsAsString() {
		return wrapForPublic(() -> this.service.getAllStudyFieldsAsString());
	}
}
