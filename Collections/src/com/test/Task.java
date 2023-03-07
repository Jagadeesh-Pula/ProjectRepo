package com.test;

import java.util.ArrayList;
import java.util.List;

public class Task {

		public ArrayList<Products> pricefilter(ArrayList<Products> productList){
		      ArrayList<Products> filterList = new ArrayList<Products>();
		      for(Products product : productList )
			  {
			      if(product.productPrice<100)
				  {
				      filterList.add(product);
				  }
			  
			  }

		return filterList;
		}		
		public static void main(String[] args) {			
		  ArrayList<Products> list = new ArrayList<Products>();
		  list.add(new Products("Dobar", 99));
		  list.add(new Products("Miswak", 200));
		  list.add(new Products("Namboodari", 300));
		  list.add(new Products("Himalaya", 50));
		  list.add(new Products("Bhasha", 251));
		  list.add(new Products("Benarji", 20));
		  list.add(new Products("Navven dental care", 400));
		  list.add(new Products("Praveen super paste ", 500));
		  
		  ArrayList<Employee> employeeList = new ArrayList<Employee>();
		  employeeList.add(new Employee("Mahesh", 56000));
		  employeeList.add(new Employee("Miswak", 80000));
		  employeeList.add(new Employee("Namboodari", 30000));
		  employeeList.add(new Employee("Himalaya", 50000));
		  employeeList.add(new Employee("Bhasha", 25100));
		  employeeList.add(new Employee("Benarji", 2000));
		  employeeList.add(new Employee("Navven ", 40000));
		  employeeList.add(new Employee("Praveen", 50000));
		 
		  Task task = new Task();
//		ArrayList<Products> sortedList =   task.pricefilter(list);
//		for(Products product : sortedList) {
//			System.out.println("Name of the product " +  product.productName + "   "  + "Price of the product :" + product.productPrice);
//		}
//		
//		float averagesalary = task.averageSalaryFinder(employeeList);
//		System.out.println(averagesalary);
		
		List<Integer> primeList  = task.primeNumberFinder(100);
		for(Integer in : primeList) {
			System.out.println(in);
		}
		  
		}
		
	
		 // write a method which accepts list of employees and returns average  salary of them.

		  public  float  averageSalaryFinder(ArrayList<Employee> empList) {		  
			
			  double sumofemployeeSalaray  = 0;			
			  for(Employee employee : empList) {
				  System.out.println(employee.salary);
				  sumofemployeeSalaray = sumofemployeeSalaray + employee.salary;
			  }			  
			return (float) (sumofemployeeSalaray/empList.size());		  
		  }
		  
		  public List<Integer> primeNumberFinder(Integer number) {
			  ArrayList<Integer> primeList  = new ArrayList<Integer>();
			  int fact = 0;
                for(int i = 1; i <= number ; i++) {
                	
                	for(int j = 1; j<=i; j++) {
                		if(i%j == 0) {
                			fact++;
                		}
                	}
                	if(fact <= 2 ) {
                		primeList.add(i);
                	}
                	fact = 0;
                }
			  return primeList;
			  
			  }
}
 class Products{

	String productName;
	double productPrice;

	public Products(String productName, double productPrice){

	this.productName  = productName;
	this.productPrice =  productPrice;
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