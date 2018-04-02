package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;

/**
 * The type Login form.
 */
public class LoginForm extends BaseModel {

    private String username;
    private String password;

    /**
     * Instantiates a new Login form.
     */
    public LoginForm() { }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername()  { return this.username; }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) { this.username = username; }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() { return this.password; }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) { this.password = password; }
}
