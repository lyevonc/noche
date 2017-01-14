package org.noche.api;

import org.noche.model.places.Place;
import org.noche.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Timi on 1/14/2017.
 */
@RestController
public class PlaceController {

    /* --- Static members --- */

    private static final Logger logger = LoggerFactory.getLogger(PlaceController.class);

    /* --- Members --- */

    @Autowired
    private PlaceService placeService;

    /* --- Public methods --- */

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void savePlace() {
        Place place = new Place("Sunset");
        placeService.savePlace(place);
    }
}
