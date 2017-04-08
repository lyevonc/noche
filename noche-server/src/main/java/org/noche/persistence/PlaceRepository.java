package org.noche.persistence;

import org.noche.model.places.Location;
import org.noche.model.places.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Timi on 1/14/2017.
 */
/*
@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    Place findByName(String name);
    List<Place> findAllPlacesByLocation(Location location);

    @Query("SELECT p FROM Place p WHERE p.location.city = ?1")
    List<Place> findAllPlacesByCity(String city);
}
*/