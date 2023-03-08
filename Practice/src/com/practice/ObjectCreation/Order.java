package com.practice.ObjectCreation;

import java.io.Serializable;

public class Order implements Cloneable, Serializable{
	
	//1010, "food", 2021, 300.00);
	
	private int ordNum;
	private String type;
	private int ordYear;
	private double ordCost;
	public int getOrdNum() {
		return ordNum;
	}
	public void setOrdNum(int ordNum) {
		this.ordNum = ordNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getOrdYear() {
		return ordYear;
	}
	public void setOrdYear(int ordYear) {
		this.ordYear = ordYear;
	}
	public double getOrdCost() {
		return ordCost;
	}
	public void setOrdCost(double ordCost) {
		this.ordCost = ordCost;
	}
	
	public Order() {
		
	}
	public Order(int ordNum, String type, int ordYear, double ordCost) {
		
		this.ordNum = ordNum;
		this.type = type;
		this.ordYear = ordYear;
		this.ordCost = ordCost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
