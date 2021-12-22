package com.cloud.microservice.repositories;

import com.cloud.microservice.entities.UserAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

    UserAccount findByUsername(String username);
}
