package org.noche.api;

import dto.Gender;
import dto.UserInfo;
import org.noche.model.users.User;
import org.noche.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Timi on 4/7/2017.
 */
@RestController
public class UserController {

    /* --- Static members --- */

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /* --- Members --- */

    @Autowired
    private UserService userService;

    /* --- Public methods --- */
    @RequestMapping(value = "/createUser2/{name}/{email}" ,method = RequestMethod.GET)
    public void createTest(@PathVariable String name, String email)
    {
    userService.createUser(name,email, Gender.MALE,12);
    }
    @RequestMapping(value = "/login/{username}/{password}/" ,method = RequestMethod.GET)
    public User Validate(@PathVariable(value = "userName") String userName, @PathVariable(value ="password") String password)
    {
         return userService.findByCredentials(userName,password);

    }
   // public String Register ()
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public void createUser(@RequestBody UserInfo userInfo) {
        // TODO get credentials
        userService.createUser(userInfo.getName(), userInfo.getEmail(), userInfo.getGender(), userInfo.getAge());
    }

}
