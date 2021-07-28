package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Category;

public interface CategoryRepositories extends JpaRepository<Category, Integer> {

}
