package org.noche.service.impl;

import org.noche.model.users.User;
import org.noche.persistence.UserRepository;
import org.noche.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Timi on 4/5/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    /* --- Members --- */

    @Autowired
    private UserRepository userRepository;

    /* --- Overridden methods --- */

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createUser(String name, String email) {

    }
}
