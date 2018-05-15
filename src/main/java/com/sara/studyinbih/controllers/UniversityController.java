package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.helpers.UniversityFilter;
import com.sara.studyinbih.persistence.model.helpers.forms.ImageUploadForm;
import com.sara.studyinbih.persistence.model.helpers.forms.ReviewForm;
import com.sara.studyinbih.persistence.model.tables.University;
import com.sara.studyinbih.services.UniversityService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * The type University controller.
 */
@Controller
public class UniversityController extends BaseController {

    @Autowired
    private UniversityService service;

    private static final String PAGE_NUMBER = "pageNumber";
    private static final String PAGE_SIZE = "pageSize";
    private static final String NAME_FILTER = "nameFilter";
    private static final String CITY_FILTER = "cityFilter";
    private static final String SORT_BY = "sortBy";
    private static final String PRICE_FILTER = "priceFilter";
    private static final String RATING_FILTER = "ratingFilter";
    private static final String STUDY_FIELD_FILTER = "studyFieldFilter";

    private static final String DEFAULT_PAGE_NUMBER = "1";
    private static final String DEFAULT_PAGE_SIZE = "9";
    private static final String DEFAULT_PRICE_FILTER = "0";
    private static final String DEFAULT_RATING_FILTER = "0";

    /**
     * Create university result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/createUniversity",
            method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createUniversity(@RequestBody University university, HttpSession session) {
        return wrapForAdmin(() -> this.service.createUniversity(university), session);
    }

    /**
     * Edit university result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/editUniversity",
            method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity editUniversity(@RequestBody University university, HttpSession session) {
        return wrapForAdmin(() -> this.service.editUniversity(university), session);
    }

    /**
     * Delete university result.
     *
     * @param universityId the id
     * @return the result
     */
    @RequestMapping(value = "/api/v1/deleteUniversity/{universityId}",
            method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteUniversity(@PathVariable String universityId, HttpSession session) {
        return wrapForAdmin(() -> this.service.deleteUniversity(UUID.fromString(universityId)), session);
    }

    /**
     * Gets all universities.
     *
     * @return the all universities
     */
    @RequestMapping(value = "/api/v1/getUniversitiesWithFilter", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllUniversities(
            @RequestParam(name = PAGE_NUMBER, defaultValue = DEFAULT_PAGE_NUMBER) String pageNumber,
            @RequestParam(name = PAGE_SIZE, defaultValue = DEFAULT_PAGE_SIZE) String pageSize,
            @RequestParam(name = PRICE_FILTER, defaultValue = DEFAULT_PRICE_FILTER, required = false) String priceFilter,
            @RequestParam(name = RATING_FILTER, defaultValue = DEFAULT_RATING_FILTER, required = false) String ratingFilter,
            @RequestParam(name = NAME_FILTER, required = false) String nameFilter,
            @RequestParam(name = SORT_BY, required = false) String sortBy,
            @RequestParam(name = CITY_FILTER, required = false) String cityFilter,
            @RequestParam(name = STUDY_FIELD_FILTER, required = false) String studyFieldFilter
    ) {
        return wrapForPublic(() -> this.service.findUniversitiesWithFilter(
                UniversityFilter.createFilter()
                        .setPageSize(Integer.parseInt(pageNumber))
                        .setNameFilter(nameFilter)
                        .setCityFilter(!StringUtils.isBlank(cityFilter) ? UUID.fromString(cityFilter) : null)
                        .setSort(sortBy)
                        .setPriceFilter(Integer.parseInt(priceFilter))
                        .setRatingFilter(Integer.parseInt(ratingFilter))
                        .setStudyFieldFilter(studyFieldFilter)

        ));
    }

    /**
     * Gets all universities
     * @return the universities
     */
    @RequestMapping(value = "/api/v1/getAllUniversities",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllUniversities() {
        return wrapForPublic(() -> this.service.getAllUniversities());
    }


    /**
     * Gets university.
     *
     * @param universityId the id
     * @return the university
     */
    @RequestMapping(value = "/api/v1/getUniversity/{universityId}",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getUniversity(@PathVariable String universityId) {
        return wrapForPublic(() -> this.service.getUniversityWithId(UUID.fromString(universityId)));
    }

    /**
     * em
     * Gets nearby universities.
     *
     * @param latitude  the latitude
     * @param longitude the longitude
     * @return the nearby universities
     */
    @RequestMapping(value = "/api/v1/getNearbyUniversities/{latitude}/{longitude}",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getNearbyUniversities(@PathVariable("latitude") Float latitude,
                                                @PathVariable("longitude") Float longitude) {
        return wrapForPublic(() -> this.service.getNearbyUniversities(latitude, longitude));
    }

    /**
     * Gets popular universities.
     *
     * @return the popular universities
     */
    @RequestMapping(value = "/api/v1/getPopularUniversities", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getPopularUniversities() {
        return wrapForPublic(() -> this.service.getPopularUniversities());
    }

    /**
     * Gets popular locations.
     *
     * @return the popular locations
     */
    @RequestMapping(value = "/api/v1/getPopularLocations", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getPopularLocations() {
        return wrapForPublic(() -> this.service.getPopularLocations());
    }

    /**
     * Post review result.?
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/postReview", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity postReview(@RequestBody ReviewForm reviewForm, HttpSession session) {
        return wrapForUser(() -> this.service
                .postReview(reviewForm, this.userCache.get((String) session.getAttribute("uid"))), session);
    }

    /**
     * Gets number of universities.
     *
     * @return the number of universities
     */
    @RequestMapping(value = "/api/v1/getNumberOfUniversities", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getNumberOfUniversities() {
        return wrapForPublic(() -> this.service.getNumberOfUniversities());
    }

    /**
     * Update picture result.
     *
     * @return the result
     */
    @RequestMapping(value = "/api/v1/admin/updatePicture",
            method = RequestMethod.PATCH, produces = "application/json")
    public ResponseEntity updatePicture(@RequestBody ImageUploadForm imageUploadForm, HttpSession session) {
        return wrapForAdmin(() -> this.service.
                updatePicture(imageUploadForm), session);
    }


    /**
     * Gets study programs by university.
     *
     * @param universityId the id
     * @return the university
     */
    @RequestMapping(value = "/api/v1/getStudyPrograms/{universityId}",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getStudyProgramsByUniversity(@PathVariable String universityId) {
        return wrapForPublic(() -> this.service.getStudyPrograms(UUID.fromString(universityId)));
    }

}
