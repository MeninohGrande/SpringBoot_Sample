package com.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Order;
import com.spring.repositories.OrderRepositories;



@Service
public class OrderService {

	@Autowired
	private OrderRepositories orderRepositories;
	
	public List<Order> findAll(){
		List<Order> order = orderRepositories.findAll();
		return order;
	}
	
	public Order findById(Integer id) {
		Optional<Order> order = orderRepositories.findById(id);
		return order.get();
	}
	
}
