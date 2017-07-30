package org.noche.algo;

import dto.Gender;
import org.noche.model.users.User;

/**
 * Created by liat yevon on 28/07/2017.
 */
public class InterstsVector {

    private  int [] vector;

    public InterstsVector(User user) {
        vector = new int[34];
        // Check if the user gender
        if (user.getGender() == Gender.FEMALE)//if the gender in female
        {
            vector[0] = 1;
        } else
        {
            vector[1] = 1;
        }
        int age = user.getAge();
        if (age<18)
            vector[2]=1;
        else if (age<=24)
            vector [3]=1;
        else if (age >=60)
            vector[11]=1;
        else
            vector[age/5-1]=1;


    }
}
