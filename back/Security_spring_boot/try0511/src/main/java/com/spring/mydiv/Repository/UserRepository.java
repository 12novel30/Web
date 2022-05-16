package com.spring.mydiv.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mydiv.Domain.Entity.USER;

@Repository
public interface UserRepository extends JpaRepository<USER, Long> {
    Optional<USER> findByEmail(String Email);
}