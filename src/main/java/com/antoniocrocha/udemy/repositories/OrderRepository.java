package com.antoniocrocha.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniocrocha.udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
