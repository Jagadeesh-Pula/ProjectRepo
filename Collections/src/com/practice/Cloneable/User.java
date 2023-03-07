package com.practice.Cloneable;

public class User implements Cloneable {
	private String name;
	private int id;
	private String email;
	private Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		User user= (User) super.clone();
		Address addressCloned=(Address) user.getAddress().clone();
		user.setAddress(addressCloned);
		return user;
	}
	
	public User(String name, int id, String email, Address address) {
		
		this.name = name;
		this.id = id;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
