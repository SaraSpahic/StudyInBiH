package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.helpers.forms.RegisterForm;
import com.sara.studyinbih.persistence.model.tables.City;
import com.sara.studyinbih.services.CityService;
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
 * The type City controller.
 */
@Controller
public class CityController extends BaseController {

	@Autowired
	private CityService service;

	/**
	 * Gets city.
	 *
	 * @param cityId the location id
	 * @return the city
	 */
	@RequestMapping(value = "/api/v1/getCity/{cityId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getCity(@PathVariable final String cityId) {
		return wrapForPublic(() -> this.service.getCity(UUID.fromString(cityId)));
	}


	/**
	 * Create city result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/admin/createCity", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity createCity(@RequestBody City city, HttpSession session) {
		return wrapForAdmin(() -> this.service.createCity(city), session);
	}

	/**
	 * Edit city result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/admin/editCity", method = RequestMethod.PUT, produces="application/json")
	public ResponseEntity editCity(@RequestBody City city, HttpSession session) {
		return wrapForAdmin(() -> this.service.editCity(city), session);
	}

	/**
	 * Delete city result.
	 *
	 * @param cityId the id
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/deleteCity/{cityId}", method = RequestMethod.DELETE, produces="application/json")
	public ResponseEntity deleteCity(@PathVariable final String cityId, HttpSession session) {
		return wrapForAdmin(() -> this.service.deleteCity(UUID.fromString(cityId)), session);
	}

	/**
	 * Gets all cities.
	 *
	 * @return the all cities
	 */
    @RequestMapping(value = "/api/v1/getAllCities", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllCities() {
		return wrapForPublic(() -> this.service.getAllCities());
	}

	/**
	 * Gets all universities in a city.
	 *
	 * @return the all universities
	 */
	@RequestMapping(value = "/api/v1/getUniversities/{cityId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllUniversities(@PathVariable final String cityId) {
		return wrapForPublic(() -> this.service.getAllUniversities(UUID.fromString(cityId)));
	}


	/**
	 * Gets all cities.
	 *
	 * @return the all cities
	 */
	@RequestMapping(value = "/api/v1/getUniversities", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllUniversities() {
		return wrapForPublic(() -> this.service.getAllCities());
	}

}
