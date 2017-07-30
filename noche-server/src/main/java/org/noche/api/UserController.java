package org.noche.api;

import dto.Gender;
import dto.UserInfo;
import org.noche.model.users.User;
import org.noche.model.users.UserCredentials;
import org.noche.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    /* --- Static members --- */

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /* --- Members --- */

    @Autowired
    private UserService userService;

    /* --- Public methods --- */
    @RequestMapping(value = "/createUser3" ,method = RequestMethod.GET)
    public void createTest2()
    {
        userService.createUser("aviran","yosefi", Gender.MALE,12,null);
    }

    @RequestMapping(value = "/createUser2/{name}/{email}" ,method = RequestMethod.GET)
    public void createTest(@PathVariable String name, String email)
    {
        userService.createUser(name,email, Gender.MALE,12,null);
    }

    @RequestMapping(value = "/createUser1", method = RequestMethod.POST)
    public void createUser1(@RequestBody UserInfo userInfo) {
        // TODO get credentials
        //    userService.createUser(userInfo.getName(), userInfo.getEmail(), userInfo.getGender(), userInfo.getAge());
    }
    @RequestMapping(value = "/createUser/{name}/{email}/{password}/{age}/{gender}/{interests}/")
    public void createUser(@PathVariable(value = "name") String name,
                           @PathVariable (value = "email") String email ,
                           @PathVariable (value = "password") String password,
                           @PathVariable (value = "age") int age,
                           @PathVariable (value = "gender")Gender gender ,
                           @PathVariable (value = "interests") String interests)
    {
        if(name.equals("M"))
        {

        }
        User newUser = new User(name,email,gender,age);
        newUser.setInterests(interests);
        UserCredentials newUserCred = new UserCredentials(email,password);
        userService.saveCerd(newUserCred);
        userService.saveUser(newUser);
    }

    @RequestMapping(value = "/login/{userName}/{password}/", method = RequestMethod.GET)
    //public UserCredentials createPlace(@PathVariable(value = "name") String name2, @PathVariable(value = "kind") String kind)
    public User Validate(@PathVariable(value = "userName") String userName, @PathVariable(value ="password") String password)
    {
        return userService.findUserByCredentials(userName,password);

    }

    @RequestMapping(value = "/findByName/{name}/")
    public User findByName(@PathVariable(value = "name") String name) {
        return userService.findByName(name);
    }

}
