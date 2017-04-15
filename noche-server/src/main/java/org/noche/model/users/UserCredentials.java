package org.noche.model.users;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Timi on 4/7/2017.
 */
@Entity(name = "User")
@Table(name = "noche_user_credentials")
public class UserCredentials extends LiteAbstractEntity {

    /* --- Members --- */

    @Column(name = "userName", unique = true)
    private String userName;

    @Column(name = "password")
    private String password;

    /* --- Constructor --- */

    public UserCredentials(){}

    public UserCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /* --- Getters/Setters --- */

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
