package org.noche.service.impl;

import com.sun.org.apache.regexp.internal.RE;
import org.noche.model.places.Location;
import org.noche.model.places.Place;
import org.noche.persistence.PlaceRepository;
import org.noche.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    @Transactional(readOnly = true)
    public Place findByName(String name) {
        return placeRepository.findByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Place> findAllPlacesByLocation(Location location) {
        return placeRepository.findAllPlacesByLocation(location);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Place> findAllPlacesByCity(String city) {
        return placeRepository.findAllPlacesByCity(city);
    }
}
