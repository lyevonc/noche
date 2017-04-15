package org.noche.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Timi on 4/7/2017.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/dbTest", method = RequestMethod.GET)
    public String testing() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://nocherds.chmnk4j4iyvr.us-west-2.rds.amazonaws.com:3306/Noche","root", "n0ch3n0ch3");
            conn.close();
            return "YAY";
        } catch (Exception e) {
            e.printStackTrace();
            return "NAY\n" + e.getMessage();
        }
    }
}
