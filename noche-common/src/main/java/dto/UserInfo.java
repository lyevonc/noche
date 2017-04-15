package dto;

import java.io.Serializable;

/**
 * Created by Timi on 4/7/2017.
 */
public class UserInfo implements Serializable {

    /* --- Static members --- */

    private static final long serialVersionUID = 6476884029708232173L;

    /* --- Members --- */

    private String name;
    private String email;
    private Gender gender;
    private int age;

    /* --- Constructor --- */

    public UserInfo() {
    }

    public UserInfo(String name, String email, Gender gender, int age) {
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
