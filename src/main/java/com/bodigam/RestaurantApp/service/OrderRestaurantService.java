package com.bodigam.RestaurantApp.service;

import java.util.List;


import com.bodigam.RestaurantApp.entity.Order;

public interface OrderRestaurantService {
	List<Order> getAllOrders();

	Order save(Order order);

	Order getOrderById(int id);

//	Order updateOrder(Order order);
//
	void deleteOrderById(int id);
}
