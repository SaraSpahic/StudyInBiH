package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.helpers.forms.ImageUploadForm;
import com.sara.studyinbih.services.AdministratorService;
import com.sara.studyinbih.utils.FileNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * The type Administrator controller.
 */
@Controller
public class AdministratorController extends BaseController {

    @Autowired
    private AdministratorService service;

    private static final String IMAGE_ASSETS_DIRECTORY = "public/assets/images/";

    @RequestMapping(value = "/api/v1/admin/deletePicture/{pictureId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity deletePicture(@PathVariable String pictureId, HttpSession session) {
        return wrapForAdmin(() -> this.service.deletePicture(UUID.fromString(pictureId)), session);
    }

    @RequestMapping(value = "/api/v1/admin/getAdministratorStatistics", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAdministratorStatistics(HttpSession session) {
        return wrapForAdmin(() -> this.service.getAdministratorStatistics(), session);
    }


}
