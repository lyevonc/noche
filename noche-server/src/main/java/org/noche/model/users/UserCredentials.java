package org.noche.model.users;

import dto.LocationInfo;
import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import dto.LocationInfo;
import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "UserCredentials")
@Table(name = "noche_user_credentials", uniqueConstraints = @UniqueConstraint(columnNames = {"userName", "password"}))
public class UserCredentials extends LiteAbstractEntity {

    /* --- Static members --- */

    private static final long serialVersionUID = -214344520439449855L;

    /* --- Members --- */

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    /* --- Constructor --- */

    public UserCredentials() {
    }

    public UserCredentials( String userName , String password) {
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
