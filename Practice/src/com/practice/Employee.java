package com.practice;

public class Employee {
	String name;
	int salary;
	String location;
	public Employee(String name,int salary,String location) {
		this.name=name;
		this.salary=salary;
		this.location=location;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}

	


}
