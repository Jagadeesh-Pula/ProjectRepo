package com.practice.Task;

public class Address {
	private String place;
	private String city;
	private int pin;
	
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [place=" + place + ", city=" + city + ", pin=" + pin + "]";
	}
	public Address(String place, String city, int pin) {
		
		this.place = place;
		this.city = city;
		this.pin = pin;
	}
	
	
	

}
