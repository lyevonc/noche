package org.noche.service;

import org.noche.model.places.Location;
import org.noche.model.places.Place;

import java.util.List;

/**
 * Created by Timi on 1/14/2017.
 */
public interface PlaceService {

    void savePlace(Place place);

    Place findByName(String name);

    List<Place> findAllPlacesByLocation(Location location);
    List<Place> findAllPlacesByCity(String city);

}
