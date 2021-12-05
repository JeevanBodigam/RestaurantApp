package com.bodigam.RestaurantApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemID;
	
	@Column(name = "item_name", nullable = false)
	private String itemName;
	

	@Column(name = "item_price")
	private double itemPrice;
	
	@Column(name = "hasDiscount")
	private boolean hasDiscount;
	
	@Column(name = "item_img")	
	private String itemImg;
	
	
	public Menu() {
		
	}
	public Menu(String itemName, double itemPrice, boolean hasDiscount, String itemImg) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.hasDiscount = hasDiscount;
		this.itemImg = itemImg;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public boolean isHasDiscount() {
		return hasDiscount;
	}
	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public String getItemImg() {
		return itemImg;
	}
	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

}
