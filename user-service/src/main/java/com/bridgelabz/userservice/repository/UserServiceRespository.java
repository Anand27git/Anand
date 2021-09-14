package com.bridgelabz.userservice.repository;

import com.bridgelabz.userservice.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserServiceRespository extends JpaRepository<UserRegistration, Integer> {

        Optional<UserRegistration> findByEmail(String emailID);
        }
