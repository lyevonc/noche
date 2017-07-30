package org.noche.service;

import dto.PlaceInfo;
import org.noche.model.places.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by Timi on 1/14/2017.
 */
public interface PlaceService {

    void            savePlace(Bar bar);
    void            saveBar(Bar bar);
    void            saveClub(Club club);
    void            saveLocation(Location location);
    void            saveRestaurant(Restaurant restaurant);
    List<Bar>       getAllPlaces();
    List<Bar>       getAllBars();
    List<Restaurant> getAllRests();
    List<Club>      getAllClubs();
    List <String>   getAllBarsFrontUrl();
    List <String>   getAllRestFrontUrl();
    List <String>   getAllClubsFrontUrl();
    Bar findByName(String name);
    List<String> getAllNames();
    Location getLocationById(int id);

//    Place findByName(String name);
//
//    List<Place> findAllPlacesByLocation(Location location);
//    List<Place> findAllPlacesByCity(String city);

}
