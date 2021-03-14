package com.antoniocrocha.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniocrocha.udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
