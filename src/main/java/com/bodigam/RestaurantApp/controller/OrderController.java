package com.bodigam.RestaurantApp.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.entity.Order;
import com.bodigam.RestaurantApp.service.OrderRestaurantService;
import com.bodigam.RestaurantApp.service.RestaurantService;


@Controller
public class OrderController {
private OrderRestaurantService orderRestaurantService;
private RestaurantService restaurantService;
	
	public  OrderController(OrderRestaurantService orderRestaurantService,RestaurantService restaurantService) {
		super();
		this.orderRestaurantService = orderRestaurantService;
		this.restaurantService = restaurantService;
	}
	
	@GetMapping("/orders")
	public String listOrders(Model model) {
		
		List<Order> orders = orderRestaurantService.getAllOrders();
		double sum = 0;
		for(Order ordr:orders) {
			sum+=ordr.getTotalItems()*ordr.getTotalAmount();
		}
		model.addAttribute("orders", orderRestaurantService.getAllOrders());
		model.addAttribute("orderSum", sum);
		model.addAttribute("cart", orderRestaurantService.getAllOrders().size());
		return "Orders";
	}
	@GetMapping("/menu/{id}")
	public String addItemToOrder(@PathVariable int id,Model model) {
//		System.out.println(id);
		Menu menuItem = restaurantService.getMenuById(id);
//		System.out.println(menuItem.getItemName());
		Order newOrder = new Order((int)Math.floor(Math.random()*1000)+1,menuItem.getItemPrice(),1,id,menuItem.getItemName());
//		System.out.println(newOrder.getItemID());
//		double sum = 0;
		
//		orderRestaurantService.saveMenu(newOrder);
		List<Order> orders = orderRestaurantService.getAllOrders();
		orders.add(newOrder);
		for(Order ordr:orders) {
			orderRestaurantService.save(ordr);
		}
		System.out.println(orders);
//		model.addAttribute("i", sum);
		return "redirect:/orders";
	}
	@GetMapping("/order/checkout")
	public String checkoutOrder(Model model) {
		List<Order> orders = orderRestaurantService.getAllOrders();
		for(Order o:orders) {
			orderRestaurantService.deleteOrderById(o.getOrderID());
		}
		model.addAttribute("done", true);
		return "checkout";
	}
	
	@GetMapping("/gotoHome")
	public String goHome() {
		return "redirect:/home";
	}
}
