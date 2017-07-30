package org.noche.persistence;

import org.noche.model.places.Bar;
import org.noche.model.places.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by liat yevon on 17/05/2017.
 */
public interface ClubRepository  extends JpaRepository<Club, Integer> {

    Club findByName(String name);
    @Query(value = "SELECT b.urlFront FROM noche_club b", nativeQuery = true)
    List<String> getFrontUrlClubs();
    @Query(value = "SELECT b.name FROM noche_club b", nativeQuery = true)
    List<String> getClubsNames();

}
