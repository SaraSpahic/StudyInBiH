package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.tables.StudyProgram;
import com.sara.studyinbih.services.StudyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class StudyProgramController extends BaseController {


    @Autowired
    private StudyProgramService service;

    @RequestMapping(value = "/api/v1/getStudyProgram/{studyProgramId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getStudyProgram(@PathVariable final String studyProgramId) {
        return wrapForPublic(() -> this.service.getStudyProgram(UUID.fromString(studyProgramId)));
    }

    /**
     * Create studyProgram result.
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/createStudyProgram", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createStudyProgram(@RequestBody StudyProgram studyProgram, HttpSession session) {
        return wrapForAdmin(() -> this.service.createStudyProgram(studyProgram), session);
    }


    /**
     * Edit studyProgram result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/editStudyProgram", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity editStudyProgram(@RequestBody StudyProgram studyProgram, HttpSession session) {
        return wrapForAdmin(() -> this.service.editStudyProgram(studyProgram), session);
    }

    /**
     * Delete studyProgram result.
     *
     * @param studyProgramId the id
     * @return the result
     */
    @RequestMapping(value = "/api/v1/deleteStudyProgram/{studyProgramId}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteStudyProgram(@PathVariable final String studyProgramId, HttpSession session) {
        return wrapForAdmin(() -> this.service.deleteStudyProgram(UUID.fromString(studyProgramId)), session);
    }

    /**
     * Gets all studyPrograms.
     *
     * @return the all studyPrograms
     */
    @RequestMapping(value = "/api/v1/getAllStudyPrograms", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllStudyPrograms() {
        return wrapForPublic(() -> this.service.getAllStudyPrograms());
    }


}

