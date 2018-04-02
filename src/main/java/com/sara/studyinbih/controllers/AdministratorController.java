package com.sara.studyinbih.controllers;

import com.sara.studyinbih.services.AdministratorService;
import com.sara.studyinbih.utils.FileNameUtils;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.UUID;

/**
 * The type Administrator controller.
 */
@Controller
public class AdministratorController extends BaseController {

	@Autowired
	private AdministratorService service;
	private static final String IMAGE_ASSETS_DIRECTORY = "public/assets/images/";


	@RequestMapping(value = "/api/v1/admin/fileUpload", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity fileUpload(@RequestParam("file") MultipartFile picture ,
									 @RequestParam("universityId") String universityId,
									 @RequestParam("imageType") String imageFor,
									 @RequestParam("timestamp") String timestamp,
                                     HttpSession session){
        return wrapForAdmin(() -> {
            String pathString;
            if(imageFor.equals("gallery") && timestamp != null){
                pathString = IMAGE_ASSETS_DIRECTORY + universityId + "-" + timestamp + ".";
            }
            else{
                pathString = IMAGE_ASSETS_DIRECTORY + universityId + "-" + imageFor + ".";
            }
            if (picture != null) {
                pathString+= FileNameUtils.getExtension(picture.getOriginalFilename());
                byte[] bytes = picture.getBytes();
                Files.write(Paths.get(pathString),bytes);
                return "Success";
            } else {
                return "Upload failure";
            }}, session);
	}

    @RequestMapping(value = "/api/v1/admin/deletePicture/{pictureId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity deletePicture(@PathVariable String pictureId, HttpSession session) {
		return wrapForAdmin(() -> this.service.deletePicture(UUID.fromString(pictureId)),session);
	}

	@RequestMapping(value = "/api/v1/admin/getAdministratorStatistics", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity getAdministratorStatistics(HttpSession session) {
		return wrapForAdmin(() -> this.service.getAdministratorStatistics(), session);
	}



}