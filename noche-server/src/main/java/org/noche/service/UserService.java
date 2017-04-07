package org.noche.service;

import org.noche.model.users.User;

/**
 * Created by Timi on 4/5/2017.
 */
public interface UserService {

    User findByName(String name);
    User findByEmail(String email);
}
