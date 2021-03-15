package com.antoniocrocha.udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniocrocha.udemy.entities.Product;
import com.antoniocrocha.udemy.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
    public List<Product> findAll(){
    	return repository.findAll();
    }
    
    public Product findById(Long id) {
    	Optional<Product> obj = repository.findById(id) ;
    	return obj.get();
    }
}
