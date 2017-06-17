package org.noche.algo;
import org.noche.model.places.Location;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liat yevon on 02/06/2017.
 */
public class Distance {


    public Distance(){

    }
    public static double Calc(Location user, Location place){
        if(place==null)
            return 0;


        final int R = 6371; // Radius of the earth

        double dLon = Math.toRadians(place.getLon()-user.getLon());
        double dLat = Math.toRadians(place.getLat()-user.getLat());

        double a = (Math.sin(dLat / 2) * Math.sin(dLat / 2)) +
                (Math.cos(Math.toRadians(user.getLat()))) *
                        (Math.cos(Math.toRadians(place.getLat()))) *
                        (Math.sin(dLon / 2)) *
                        (Math.sin(dLon / 2));
        double angle = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return angle*R;

    }

}
