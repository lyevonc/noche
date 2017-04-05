package org.noche.persistence;

import org.noche.model.places.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Timi on 1/14/2017.
 */
@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    Place findByName(String name);
}
