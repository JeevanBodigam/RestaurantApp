package com.bodigam.RestaurantApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.entity.Order;
import com.bodigam.RestaurantApp.Repository.OrderRepository;
import com.bodigam.RestaurantApp.Repository.RestaurantRepository;
//import com.bodigam.RestaurantApp.service.RestaurantService;

@Service
public class OrderImplementation implements OrderRestaurantService {
	
	private OrderRepository orderRepository;
	
	public  OrderImplementation(OrderRepository orderRepo) {
		super();
		this.orderRepository = orderRepo;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order save(Order order) {
		return orderRepository.save(order);
	}


	@Override
	public Order getOrderById(int id) {
		return orderRepository.findById(id).get();
	}

//	@Override
//	public void deleteOrderById(int id) {
//		orderRepository.deleteById(id);
//		
//	}
	
	@Override
	public void deleteOrderById(int id) {
		orderRepository.deleteById(id);
	}

	
}
