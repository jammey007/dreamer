package org.grocery.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ITEM_GROCERY")
public class Item {
	private static int totalNoOfProducts;
	static {
		Item.totalNoOfProducts=0;
	}
	@GeneratedValue
	@Id
	@Column(name="ITEM_ID")
	private int id;
	public static int getTotalNoOfProducts() {
		return totalNoOfProducts;
	}
	@Column(name="NAME")
	private String name;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="PRICE")
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Item() {
		super();
		Item.totalNoOfProducts++;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
