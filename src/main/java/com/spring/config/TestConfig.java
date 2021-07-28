package com.spring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.entities.Category;
import com.spring.entities.Order;
import com.spring.entities.Product;
import com.spring.entities.User;
import com.spring.entities.enums.OrderStatus;
import com.spring.repositories.CategoryRepositories;
import com.spring.repositories.OrderRepositories;
import com.spring.repositories.ProductRepositories;
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
	@Autowired
	private ProductRepositories productRepositories;
	
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
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		productRepositories.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
	}

}
