package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.User;
import com.spring.repositories.UserRepositories;



@Service
public class UserService {

	@Autowired
	private UserRepositories userRepositories;
	
	public List<User> findAll(){
		List<User> users = userRepositories.findAll();
		return users;
	}
	
	public User findById(Integer id) {
		Optional<User> user = userRepositories.findById(id);
		return user.get();
	}
	
}
