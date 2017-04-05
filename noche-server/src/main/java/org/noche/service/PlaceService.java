package org.noche.service;

import org.noche.model.places.Place;

/**
 * Created by Timi on 1/14/2017.
 */
public interface PlaceService {

    void savePlace(Place place);

    Place findByPlaceName(String name);
}
