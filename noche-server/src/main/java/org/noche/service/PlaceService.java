package org.noche.service;

import dto.PlaceInfo;
import org.noche.model.places.Bar;
import org.noche.model.places.Location;
import org.noche.model.places.Place;

import java.util.Collection;
import java.util.List;

/**
 * Created by Timi on 1/14/2017.
 */
public interface PlaceService {

    void savePlace(Bar bar);

    List<Bar> getAllPlaces();



//    Place findByName(String name);
//
//    List<Place> findAllPlacesByLocation(Location location);
//    List<Place> findAllPlacesByCity(String city);

}
