package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Order;

public interface OrderRepositories extends JpaRepository<Order, Integer> {

}
