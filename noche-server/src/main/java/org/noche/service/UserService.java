package org.noche.service;

import dto.Gender;
import org.noche.model.users.User;
import org.noche.model.users.UserCredentials;

import java.util.List;
/**
 * Created by Timi on 4/5/2017.
 */
public interface UserService {

    void createUser(String name, String email, Gender gender, int age,String interests);

    User findByName(String name);
    User findByEmail(String email);
    User findUserByCredentials(String name,String password);
    List<UserCredentials> findAllCred();
    void saveCerd(UserCredentials userCred);
    void saveUser(User newUser);
}
