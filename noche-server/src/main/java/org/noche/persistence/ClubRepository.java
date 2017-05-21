package org.noche.persistence;

import org.noche.model.places.Bar;
import org.noche.model.places.Club;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liat yevon on 17/05/2017.
 */
public interface ClubRepository  extends JpaRepository<Club, Integer> {

    Club findByName(String name);
}
