package com.bodigam.RestaurantApp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.service.OrderRestaurantService;
//import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.service.RestaurantService;

@Controller
public class RestaurantController {
	private RestaurantService restaurantService;
	private OrderRestaurantService orderRestaurantService;

	public RestaurantController(RestaurantService restaurantService, OrderRestaurantService orderRestaurantService) {
		super();
		this.restaurantService = restaurantService;
		this.orderRestaurantService = orderRestaurantService;
	}

	@GetMapping("/home")
	public String listMenu(Model model) {
		System.out.println(orderRestaurantService.getAllOrders().size());
//			model.addAttribute("success1", orderRestaurantService.getAllOrders().size());
		model.addAttribute("menuitems", restaurantService.getAllMenuItems());
		return "Home";
	}
	
	@GetMapping("/admin")
	public String addItem(Model model) {
		// create Item object to hold Item form data
				Menu menu = new Menu();
				model.addAttribute("menu", menu);
				return "create_item";
	}
	@PostMapping("/menu")
	public String saveMenu(@ModelAttribute("menu") Menu menu) {
		restaurantService.saveMenu(menu);
		return "redirect:/home";
	}

}
