package org.noche.service;

import dto.PlaceInfo;
import org.noche.model.places.Bar;
import org.noche.model.places.Club;
import org.noche.model.places.Location;
import org.noche.model.places.Place;

import java.util.Collection;
import java.util.List;

/**
 * Created by Timi on 1/14/2017.
 */
public interface PlaceService {

    void savePlace(Bar bar);
    void saveBar(Bar bar);
    void saveClub(Club club);
    List<Bar> getAllPlaces();
    List<Bar> getAllBars();



//    Place findByName(String name);
//
//    List<Place> findAllPlacesByLocation(Location location);
//    List<Place> findAllPlacesByCity(String city);

}
