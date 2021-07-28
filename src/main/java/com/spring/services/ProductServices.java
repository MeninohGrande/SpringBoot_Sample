package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Product;
import com.spring.repositories.ProductRepositories;

@Service
public class ProductServices {

	@Autowired
	private ProductRepositories productRepositories;
	
	
	public Product findById(Integer id) {
		Optional<Product> obj = productRepositories.findById(id);
		return obj.get();
	}
	
	public List<Product> findAll(){
		return productRepositories.findAll();
	}
	
}
