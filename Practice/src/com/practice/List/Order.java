package com.practice.List;

import java.util.Objects;

public class Order implements Comparable<Order> {
	
	
	private int cost;
	private String name;
	private int year;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Order [cost=" + cost + ", name=" + name + ", year=" + year + "]";
	}
	public Order(int cost, String name, int year) {
		this.cost = cost;
		this.name = name;
		this.year = year;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Order o) {
		if(this.cost>o.cost)
			return 1;
		else if(this.cost<o.cost)
			return -1;
		else
		return 0;
	}
	
	
	
	

}
