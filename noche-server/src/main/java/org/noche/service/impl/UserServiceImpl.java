package org.noche.service.impl;

import dto.Gender;
import org.noche.model.users.User;
import org.noche.model.users.UserCredentials;
import org.noche.persistence.UserCredentialsRepository;
import org.noche.persistence.UserRepository;
import org.noche.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;
/**
 * Created by Timi on 4/5/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    /* --- Members --- */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserCredentialsRepository userCredentialsRepository;

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
    // TODO thecreate user with check of existed users
    @Override
    public void createUser(String name, String email, Gender gender, int age,String interests)
    {
        if (userRepository.findByEmail(email) == null && userRepository.findByName(name) == null)
        {

            User newUser = new User(name, email, gender, age);
            newUser.setInterests(interests);
            userRepository.save(newUser);
        }
    }

    @Override
    public User findUserByCredentials(String name,String password)
    {

        UserCredentials check = userCredentialsRepository.findByUserName(name);
        if(check==null)
            return  null;
        else if(!check.getPassword().equals(password))
            return null;
        return userRepository.findByCredentialsId(check);
       /* System.out.println("liat2");
        System.out.println(check);
       User liat= new User();
       liat.setAge(55);
       return liat ;*/
    }
    @Override
    public void saveCerd(UserCredentials userCred)
    {
        userCredentialsRepository.save(userCred);
    }
    @Override
    public void saveUser(User newUser)
    {
        userRepository.save(newUser);
    }
    public  List<UserCredentials> findAllCred()
    {
        return userCredentialsRepository.findAll();
    }


}

/*System.out.println("find by");
        UserCredentials check = userCredentialsRepository.findByUserName("l_y_c@walla.com");
        System.out.println("login2222");
        //if(check==null)
            //return  null;
      //  else if(check.getPassword()!=password)
      //      return null;
        return check;//userRepository.findByCredentials(check);*/