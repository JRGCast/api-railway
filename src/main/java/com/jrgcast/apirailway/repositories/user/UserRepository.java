package com.jrgcast.apirailway.repositories.user;

import com.jrgcast.apirailway.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
