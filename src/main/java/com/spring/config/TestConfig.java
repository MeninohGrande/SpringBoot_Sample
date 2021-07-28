package com.spring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.entities.Category;
import com.spring.entities.Order;
import com.spring.entities.User;
import com.spring.entities.enums.OrderStatus;
import com.spring.repositories.CategoryRepositories;
import com.spring.repositories.OrderRepositories;
import com.spring.repositories.UserRepositories;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepositories userRepositories;
	@Autowired
	private OrderRepositories orderRepositories;
	@Autowired
	private CategoryRepositories categoryRepositories;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "pedro", "p@gmail", "99999", "12345");
		User u2 = new User(null, "nuna", "n@gmail", "55555", "67890");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepositories.saveAll(Arrays.asList(u1, u2));
		orderRepositories.saveAll(Arrays.asList(o1, o2, o3));

		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		categoryRepositories.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
