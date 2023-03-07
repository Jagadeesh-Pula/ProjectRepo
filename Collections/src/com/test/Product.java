package com.test;

public class Product {
	
	String name;
	int id;
	int rs;
	public Product(String name, int id, int rs) {
		super();
		this.name = name;
		this.id = id;
		this.rs = rs;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", rs=" + rs + "]";
	}
	
	

}
