package com.sara.studyinbih.controllers;

import com.sara.studyinbih.persistence.model.helpers.SessionUser;
import com.sara.studyinbih.persistence.model.helpers.forms.LoginForm;
import com.sara.studyinbih.persistence.model.helpers.forms.RegisterForm;
import com.sara.studyinbih.persistence.model.tables.User;
import com.sara.studyinbih.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * The type User controller.
 */

@Controller
public class UserController extends BaseController {



	@Autowired
	private UserService service;


	/**
	 * Login result.
	 *
	 * @return the result
	 */
	@RequestMapping(value = "/api/v1/login", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity login(@RequestBody LoginForm loginForm, HttpSession session) {
		return wrapForPublic(() -> {
			User user = this.service.authenticate(loginForm);

			UUID id = UUID.randomUUID();
			session.removeAttribute("uid");
			session.setAttribute("uid",id.toString());
			this.userCache.put(id.toString(), user);
			return user;
		});
	}

	/**
	 * Logout result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/logout", method = RequestMethod.POST, produces="application/json")
	public ResponseEntity logout(HttpSession session) {
		return wrapForPublic(() -> {
			this.userCache.invalidate(session.getAttribute("uid"));
			session.removeAttribute("uid");
			return "{}";
		});
	}

	/**
	 * Register result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/register",
            method = RequestMethod.POST,
            produces="application/json")
	public ResponseEntity register(@RequestBody RegisterForm registerForm,HttpSession session) {
		return wrapForPublic(() -> {
			User user = this.service.register(registerForm);
			UUID id = UUID.randomUUID();
            session.removeAttribute("uid");
            session.setAttribute("uid",id.toString());
			this.userCache.put(id.toString(), user);
			return user;
		});
	}

	/**
	 * Gets current user.
	 *
	 * @return the current user
	 */
    @RequestMapping(value = "/api/v1/getCurrentUser", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getCurrentUser(HttpSession session) {
		return wrapForPublic(() -> {
			String sessionUid = (String) session.getAttribute("uid");
			User user = null;
			if(sessionUid != null) {
                user = this.userCache.get(sessionUid);
            }
			if (user != null) {
				return new SessionUser(user);
			} else {
				return new SessionUser();
			}
		});
	}

	/**
	 * Gets all users.
	 *
	 * @return the all users
	 */
    @RequestMapping(value = "/api/v1/admin/getAllUsers", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getAllUsers(HttpSession session) {
		return wrapForAdmin(() -> this.service.getAllUsers(), session);
	}

	/**
	 * Gets user.
	 *
	 * @param userId the user id
	 * @return the user
	 */
    @RequestMapping(value = "/api/v1/admin/getUser/{userId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getUser(@PathVariable final String userId, HttpSession session) {
		return wrapForAdmin(() -> this.service.getUser(UUID.fromString(userId)), session);
	}

	/**
	 * Edit user result.
	 *
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/admin/editUser", method = RequestMethod.PATCH, produces="application/json")
	public ResponseEntity editUser(@RequestBody User user, HttpSession session) {
		return wrapForAdmin(() -> this.service.editUser(user), session);
	}

	/**
	 * Delete user result.
	 *
	 * @param userId the user id
	 * @return the result
	 */
    @RequestMapping(value = "/api/v1/admin/deleteUser/{userId}", method = RequestMethod.DELETE, produces="application/json")
	public ResponseEntity deleteUser(@PathVariable String userId, HttpSession session) {
		return wrapForAdmin(() -> this.service.deleteUser(UUID.fromString(userId)), session);
	}
}
