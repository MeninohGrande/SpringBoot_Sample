package com.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Category;
import com.spring.services.CategoryService;

@RestController
@RequestMapping(value = "cat")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "{/id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		 return ResponseEntity.ok().body(categoryService.findById(id));
	}
	
	@RequestMapping
	public ResponseEntity<List<Category>> findAll(){		
		return ResponseEntity.ok().body(categoryService.findAll());
	}
	
}
