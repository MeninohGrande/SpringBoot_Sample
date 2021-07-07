package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.User;

public interface UserRepositories extends JpaRepository<User, Integer> {

}
