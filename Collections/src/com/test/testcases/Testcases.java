package com.test.testcases;

import java.util.ArrayList;

public class Testcases {
	
	
	public int maxSalary(ArrayList<Employee> employee) {
		int tempsal=0;
		Employee employee2=new Employee();
		for(Employee emp:employee) {
			if(emp.salary>=tempsal) {
				tempsal=(int) emp.salary;
				employee2=emp;	
			}
				
		}
		return tempsal;
	}
	
	public int integervalues(int value) {
		int n=0;
		for(int i=0;i<100;i++) {
			n=i;
		}
		return n;
	}

}

class Employee{

	String employeeName;
	double salary;

	public Employee(String employeeName, double salary){

	this.employeeName  = employeeName;
	this.salary =  salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	}
