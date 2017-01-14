package org.noche.service.impl;

import org.noche.model.places.Place;
import org.noche.persistence.PlaceRepository;
import org.noche.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Timi on 1/14/2017.
 */
@Service
public class PlaceServiceImpl implements PlaceService {

    /* --- Static members --- */

    private static final Logger logger = LoggerFactory.getLogger(PlaceServiceImpl.class);

    /* --- Members --- */

    @Autowired
    private PlaceRepository placeRepository;

    /* --- Overridden methods --- */

    @Override
    public void savePlace(Place place) {
        placeRepository.save(place);
    }
}
