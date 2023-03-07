package com.test;

import java.util.ArrayList;

public class FinalTest {
	public static void main(String[] args) {
		
	}
	
	public Employee employee(ArrayList<Employee> employeelist){
		/*
		 * ArrayList<Employee> maxemp = new ArrayList<Employee>(); Employee emp=new
		 * Employee(); for(Employee employee : employeelist ) {
		 * 
		 * double currEmployee =emp.salary ;
		 * 
		 * if (currEmployee == null || currEmployee.getSalary() <employee.salary ) {
		 * maxemp.put(maxemp, employee); }
		 * 
		 * }
		 * 
		 * return maxemp;
		 */
		return null;
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

}
