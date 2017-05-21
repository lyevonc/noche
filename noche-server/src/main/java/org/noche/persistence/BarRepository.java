package org.noche.persistence;

import org.noche.model.places.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar, Integer> {

    Bar findByName(String name);
}
