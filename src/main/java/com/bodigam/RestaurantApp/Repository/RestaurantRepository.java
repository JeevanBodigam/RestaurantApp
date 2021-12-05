package com.bodigam.RestaurantApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodigam.RestaurantApp.entity.Menu;

@Repository
public interface RestaurantRepository extends JpaRepository<Menu, Integer>{
	
}