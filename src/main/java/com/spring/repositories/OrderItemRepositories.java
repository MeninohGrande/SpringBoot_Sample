package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.OrderItem;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Integer>{

}
