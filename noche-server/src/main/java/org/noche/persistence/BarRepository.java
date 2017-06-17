package org.noche.persistence;

import org.noche.model.places.Bar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BarRepository extends JpaRepository<Bar, Integer> {

    Bar findByName(String name);
    @Query(value = "SELECT b.urlFront FROM noche_bar b", nativeQuery = true)
    List<String> getFrontUrlBars();
}
