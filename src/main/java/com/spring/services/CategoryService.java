package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Category;
import com.spring.repositories.CategoryRepositories;
@Service
public class CategoryService {

	@Autowired
	private CategoryRepositories categoryRepositories;
	
	
	public Category findById(Integer id) {
		Optional<Category> obj = categoryRepositories.findById(id);
		return obj.get();
	}
	
	public List<Category> findAll(){
		return categoryRepositories.findAll();
	}
	
}
