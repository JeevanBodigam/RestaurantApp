package com.bodigam.RestaurantApp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.Repository.RestaurantRepository;
//import com.bodigam.RestaurantApp.service.RestaurantService;

@Service
public class ServiceImplementation implements RestaurantService {
	
	private RestaurantRepository restaurantRepository;
	
	public  ServiceImplementation(RestaurantRepository restRepo) {
		super();
		this.restaurantRepository = restRepo;
	}

	@Override
	public List<Menu> getAllMenuItems() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	@Override
	public Menu saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		return  restaurantRepository.save(menu);
	}

	@Override
	public Menu getMenuById(int id) {
		return restaurantRepository.findById(id).get();
	}

}
