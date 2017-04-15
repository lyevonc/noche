package org.noche.service.impl;

import dto.Gender;
import org.noche.model.users.User;
import org.noche.persistence.UserRepository;
import org.noche.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createUser(String name, String email, Gender gender, int age) {
        if (userRepository.findByEmail(email) == null && userRepository.findByName(name) == null) {
            userRepository.save(new User(name, email, gender, age));
        } // else, return user exists
    }
}
