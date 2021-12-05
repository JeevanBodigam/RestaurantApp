package com.bodigam.RestaurantApp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	
	@Column(name = "total_amount")
	private double totalAmount;
	
	@Column(name = "quantity")
	private int totalItems;
	
	@Column(name = "itemID")
	private int itemID;
	
	@Column(name ="itemName")
	private String itemName;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Order() {
		
	}
	
	public Order(int orderID, double totalAmount, int totalItems, int id,String name) {
		super();
		this.orderID = orderID;
		this.totalAmount = totalAmount;
		this.totalItems = totalItems;
		this.itemID = id;
		this.itemName = name;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public int  getItemID() {
		return this.itemID;
	}
	public void setItemID(int itemid) {
		this.itemID = itemid;
	}
	
	
}
