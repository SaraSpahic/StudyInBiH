package com.sara.studyinbih.persistence.model.tables;


import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.services.Passwords;

import javax.persistence.*;
import java.util.Base64;
import java.util.UUID;

/**
 * The type User.
 */
@Entity
@Table(name = "\"user\"")
public class User extends BaseModel {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private UUID id;

	@Column(name = "username")
	private String username;

	@Column(name = "hash")
	private String hash;

	@Column(name = "salt")
	private String salt;

	@Column(name = "is_admin")
	private Boolean isAdmin;

	/**
	 * Instantiates a new User.
	 */
	public User() { }

	/**
	 * Instantiates a new User.
	 *
	 * @param username     the username
	 * @param password  the password
	 */
	public User (String username, String password) {
		this.username = username;
		this.setPassword(password);
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public UUID getId() { return id; }

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(UUID id) { this.id = id; }

	/**
	 * Gets username.
	 *
	 * @return the username
	 */
	public String getUsername() { return username; }

	/**
	 * Sets username.
	 *
	 * @param username the username
	 */
	public void setUsername(String username) { this.username = username; }

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.salt = base64Encode(Passwords.getNextSalt());
		this.hash = base64Encode(Passwords.hash(password.toCharArray(), base64Decode(this.salt)));
	}

	private String base64Encode(byte[] bytes) {
		return Base64.getEncoder().encodeToString(bytes);
	}

	private byte[] base64Decode(String string) {
		return Base64.getDecoder().decode(string);
	}

	/**
	 * Gets is admin.
	 *
	 * @return the is admin
	 */
	public Boolean getIsAdmin() { return isAdmin; }

	/**
	 * Sets is admin.
	 *
	 * @param admin the admin
	 */
	public void setIsAdmin(Boolean admin) { isAdmin = admin; }
}
