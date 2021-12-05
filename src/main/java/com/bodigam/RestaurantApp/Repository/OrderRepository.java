package com.bodigam.RestaurantApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodigam.RestaurantApp.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{
	
} 
