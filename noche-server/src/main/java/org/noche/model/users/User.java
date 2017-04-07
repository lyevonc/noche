package org.noche.model.users;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.*;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "User")
@Table(name = "noche_user")
public class User extends LiteAbstractEntity {

    /* --- Members --- */

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "age")
    private int age;

    // TODO favorite places

    /* --- Constructor --- */

    public User() {
    }

    public User(String name, String email, Gender gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /* --- Getters/Setters --- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
