package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderData")
public class Order {
	@Id
	@Column(name = "Order_Id")
	private int orderId;
	@Column(name = "Order_Name")
	private String orderName;
	@Column(name = "Order_Price")
	private double orderPrice;
	@Column(name = "Order_Location")
	private String orderLocation;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderLocation() {
		return orderLocation;
	}
	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderPrice=" + orderPrice
				+ ", orderLocation=" + orderLocation + "]";
	}
	public Order(int orderId, String orderName, double orderPrice, String orderLocation) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.orderLocation = orderLocation;
	}
	public Order() {
		
	}
	
	

}
