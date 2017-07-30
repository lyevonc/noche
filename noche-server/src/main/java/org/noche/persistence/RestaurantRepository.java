package org.noche.persistence;

import org.noche.model.places.Club;
import org.noche.model.places.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by liat yevon on 26/05/2017.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    Restaurant findByName(String name);

    @Query(value = "SELECT r.urlFront FROM noche_restaurant r", nativeQuery = true)
    List<String> getFrontUrl();
    @Query(value = "SELECT b.name FROM noche_bar b", nativeQuery = true)
    List<String> getRestsNames();

}

/*public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

        Restaurant findByName(String name);

        @Query(value = "SELECT b.urlFront FROM noche_restaurant b", nativeQuery = true)
        List<String> getFrontUrlRest();

}*/
