package com.sara.studyinbih.persistence.model.helpers.forms;


import com.sara.studyinbih.persistence.model.BaseModel;
import com.sara.studyinbih.persistence.model.tables.User;

/**
 * The type Register form.
 */
public class RegisterForm extends BaseModel {

    private String username;
    private String password;

    /**

     * Instantiates a new Register form.
     */
    public RegisterForm() { }


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
    public void setPassword(String password) { this.password = password; }



    /**
     * Create account account.
     *
     * @return the account
     */
    public User createAccount() {
        User newUser = new User(this.username, this.password);
        return newUser;
    }
}
