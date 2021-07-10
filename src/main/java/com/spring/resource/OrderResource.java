package com.spring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Order;
import com.spring.services.OrderService;

@RestController
@RequestMapping(value = "/Order")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> orders = orderService.findAll();		
		
		return ResponseEntity.ok().body(orders);
	}
	
	@GetMapping(value = "/{id}")
	public  ResponseEntity<Order> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(orderService.findById(id));
		
	}
	
}
