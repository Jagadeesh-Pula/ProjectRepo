package com.practice.Cloneable;

public class Address implements Cloneable {
	
	String village;
	String streetName;
	int pinCode;
	public Address(String village, String streetName, int pinCode) {
	
		this.village = village;
		this.streetName = streetName;
		this.pinCode = pinCode;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
