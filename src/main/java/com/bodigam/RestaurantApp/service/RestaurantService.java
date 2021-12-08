package com.bodigam.RestaurantApp.service;

import java.util.List;

import com.bodigam.RestaurantApp.entity.Menu;

public interface RestaurantService {
	List<Menu> getAllMenuItems();

	Menu saveMenu(Menu menu);

	Menu getMenuById(int id);

//	Menu updateMenu(Menu menu);
//
//	void deleteMenuById(Long id);
}
