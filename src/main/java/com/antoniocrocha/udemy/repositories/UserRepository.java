package com.antoniocrocha.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniocrocha.udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
