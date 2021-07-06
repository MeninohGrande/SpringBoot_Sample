package com.spring.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;

@RestController
@RequestMapping(value = "/User")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<String> findAll(){
		User user = new User(100, "Pedro", "p@g", "9999", "12345");
		
		String init = user.toString();
		init += "\n Teste Inicial do Projeto Spring";
		
		return ResponseEntity.ok().body(init);
	}
	
}
