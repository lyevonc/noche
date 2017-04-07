package org.noche.persistence;

import org.noche.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Timi on 4/5/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);
    User findByEmail(String email);
    
}
