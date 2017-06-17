package org.noche.persistence;

import org.noche.model.users.User;
import org.noche.model.users.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by liat yevon on 14/06/2017.
 */
@Repository
public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Integer> {
     UserCredentials findByUserName(String userName);
}
