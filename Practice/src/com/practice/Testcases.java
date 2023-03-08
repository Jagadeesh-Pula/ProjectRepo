package com.practice;

import java.util.ArrayList;

public class Testcases {
	
	
	public int maxSalary(ArrayList<Employee> employee) {
		int tempsal=0;
		Employee employee2=new Employee();
		for(Employee emp:employee) {
			if(emp.salary>=tempsal) {
				tempsal=emp.salary;
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
