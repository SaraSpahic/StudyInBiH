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

    private static final String IMAGE_ASSETS_DIRECTORY = "images/";

    @RequestMapping(value = "/api/v1/admin/deletePicture/{pictureId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity deletePicture(@PathVariable String pictureId, HttpSession session) {
        return wrapForAdmin(() -> this.service.deletePicture(UUID.fromString(pictureId)), session);
    }

    @RequestMapping(value = "/api/v1/admin/getAdministratorStatistics", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAdministratorStatistics(HttpSession session) {
        return wrapForAdmin(() -> this.service.getAdministratorStatistics(), session);
    }

    @RequestMapping(value = "/api/v1/admin/pictureUpload", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity pictureUpload(@RequestParam("file") MultipartFile picture,
                                     @RequestParam("timestamp") String timestamp,
                                        HttpSession session){
        return wrapForAdmin(() -> {
            if (picture != null && timestamp != null) {
                String extension = FileNameUtils.getExtension(picture.getOriginalFilename());
                String pathString= IMAGE_ASSETS_DIRECTORY + timestamp + "."+ extension;
                byte[] bytes = picture.getBytes();
                Files.write(Paths.get(pathString),bytes);
                return "{ \"path\": \"" + "/images/"+ timestamp + "." +  extension+"\"}";
            } else {
                return "{ \"message\": \"" + "failed" + "\"}";
            }},session);
    }






}
