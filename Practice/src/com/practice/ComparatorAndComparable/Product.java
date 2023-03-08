package com.practice.ComparatorAndComparable;

public class Product implements Comparable<Product> {
	private String name;
	private int cost;
	private int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Product(String name, int cost, int year) {
		this.name = name;
		this.cost = cost;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Product o) {
		if(this.cost>o.cost)
			return 1;
		else if(this.cost<o.cost)
			return -1;
		else
		return 0;
	}
	
	
	

}
