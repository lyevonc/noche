package org.noche.service.impl;

import dto.PlaceInfo;
import org.noche.model.places.Bar;
import org.noche.model.places.Club;
import org.noche.model.places.Location;
import org.noche.model.places.Place;
import org.noche.persistence.BarRepository;
import org.noche.persistence.ClubRepository;
import org.noche.service.PlaceService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
