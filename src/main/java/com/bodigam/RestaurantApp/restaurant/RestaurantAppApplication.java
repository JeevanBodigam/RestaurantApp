package com.bodigam.RestaurantApp.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bodigam.RestaurantApp.Repository.OrderRepository;
import com.bodigam.RestaurantApp.Repository.RestaurantRepository;
import com.bodigam.RestaurantApp.entity.Menu;
import com.bodigam.RestaurantApp.entity.Order;
	
@SpringBootApplication
@ComponentScan({"com.bodigam.RestaurantApp","com.bodigam.RestaurantApp.restaurant"})
@EntityScan("com.bodigam.RestaurantApp.entity")
@EnableJpaRepositories("com.bodigam.RestaurantApp.repository")
public class RestaurantAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantAppApplication.class, args);
	}
	@Autowired(required=true)
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		
//		  Menu student1 = new Menu("Biryani",250,false,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqC65vYXrBDOas-kmSchmPd17ZtAYi4GSH5tm_OjjO_LzXop2RMkh0v3vcdTSFddAxMA0&usqp=CAU");
//		  restaurantRepository.save(student1);
//		 
//		  Menu student2 = new Menu("Mutton",290,true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqC65vYXrBDOas-kmSchmPd17ZtAYi4GSH5tm_OjjO_LzXop2RMkh0v3vcdTSFddAxMA0&usqp=CAU");
//		  restaurantRepository.save(student2);
//		  
//		 Menu student3 = new Menu("lollilop", 150,true,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqC65vYXrBDOas-kmSchmPd17ZtAYi4GSH5tm_OjjO_LzXop2RMkh0v3vcdTSFddAxMA0&usqp=CAU");
//		 restaurantRepository.save(student3);
//		
//		Order order1 = new Order(1,30,1,1,"Biryani");
//		orderRepository.save(order1);
		 
		
	}

}
