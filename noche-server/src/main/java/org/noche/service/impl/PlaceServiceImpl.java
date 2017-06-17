package org.noche.service.impl;

import org.noche.model.places.*;
import org.noche.persistence.BarRepository;
import org.noche.persistence.ClubRepository;
import org.noche.persistence.LocationRepository;
import org.noche.persistence.RestaurantRepository;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceServiceImpl.class);

    /* --- Members --- */

//    @Autowired
//    private PlaceRepository placeRepository;

    @Autowired
    private BarRepository barRepository;
    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;
    /* --- Overridden methods --- */

    @Override
    public void savePlace(Bar bar) {
        barRepository.save(bar);
    }
   // @Override
    public void saveClub(Club club)
    {
        clubRepository.save(club);
    }
    @Override
    public void saveBar(Bar bar){barRepository.save(bar);}

    @Override
    @Transactional(readOnly = true)
    public List<Bar> getAllPlaces() {
        return barRepository.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public List<Bar> getAllBars() {
        return barRepository.findAll();
    }
    public List <String>   getAllBarsFrontUrl(){
       return barRepository.getFrontUrlBars();
    }
    @Override
    public void saveLocation(Location location)
    {
        locationRepository.save(location);
    }
    @Override
    public void saveRestaurant(Restaurant restaurant)
    {
        restaurantRepository.save(restaurant);
    }
    //
//    @Override
//    @Transactional(readOnly = true)
//    public Place findByName(String name) {
//        return placeRepository.findByName(name);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Place> findAllPlacesByLocation(Location location) {
//        return placeRepository.findAllPlacesByLocation(location);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Place> findAllPlacesByCity(String city) {
//        return placeRepository.findAllPlacesByCity(city);
//    }
}
