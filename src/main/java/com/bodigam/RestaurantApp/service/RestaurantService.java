package com.bodigam.RestaurantApp.service;

import java.util.List;

import com.bodigam.RestaurantApp.entity.Menu;

public interface RestaurantService {
	List<Menu> getAllMenuItems();

	Menu saveMenu(Menu student);

	Menu getMenuById(int id);

//	Menu updateMenu(Menu student);
//
//	void deleteMenuById(Long id);
}
