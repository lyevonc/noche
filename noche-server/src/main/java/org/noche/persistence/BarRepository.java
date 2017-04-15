package org.noche.persistence;

import org.noche.model.places.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Timi on 4/7/2017.
 */
public interface BarRepository extends JpaRepository<Bar, Integer> {

    Bar findByName(String name);
}
