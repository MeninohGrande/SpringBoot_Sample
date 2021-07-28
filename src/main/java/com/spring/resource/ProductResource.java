package com.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Product;
import com.spring.services.ProductServices;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {

	@Autowired
	private ProductServices productServices;
	
	@GetMapping(value = "{/id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(productServices.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok().body(productServices.findAll());
	}
	
	
}
