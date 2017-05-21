package org.noche.persistence;

import org.noche.model.places.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liat yevon on 19/05/2017.
 */
public interface LocationRepository  extends JpaRepository<Location, Integer> {

        Location findById(Integer id);
        }