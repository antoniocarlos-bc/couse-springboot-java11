package com.antoniocrocha.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniocrocha.udemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
