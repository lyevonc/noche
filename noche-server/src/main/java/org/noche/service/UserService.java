package org.noche.service;

import dto.Gender;
import org.noche.model.users.User;
import org.noche.model.users.UserCredentials;
import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Created by Timi on 4/5/2017.
 */
public interface UserService {

    void createUser(String name, String email, Gender gender, int age);

    User findByName(String name);
    User findByEmail(String email);
    User findByCredentials(String name,String password);
}
