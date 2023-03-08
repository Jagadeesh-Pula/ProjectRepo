package com.practice;

import java.util.ArrayList;

public class FinalTest {
	

	
	public ArrayList<Products> priceFilter (ArrayList<Products> prodlist){
		
		ArrayList<Products> filterList =new ArrayList<>();
//		Products prs=new Products();
//		for(int i=0;i<prodlist.size();i++) {
//			if(prs.price>100) {
//				filterList.add(prs);
//			}
//			
//		}
		
		for(Products prod:prodlist) {
			if(prod.price>=100) 
				filterList.add(prod);
			
		}
		
		return filterList;
	}

   //WRITE A METHOD TO accept list of employees and return maximum salaried employee
	public Employee maxSalary(ArrayList<Employee> employee) {
		double tempsal=0;
		Employee employee2=new Employee();
		for(Employee emp:employee) {
			if(emp.salary>tempsal) {
				tempsal=emp.salary;
				employee2=emp;	
			}
				
		}
		return employee2;
	}
	
	public Employee minSalary(ArrayList<Employee> employee) {
		double sall=employee.get(0).salary;
		Employee employee2=new Employee();
		
		for(Employee emp:employee) {
			if(emp.salary<sall) {
				sall=emp.salary;
				employee2=emp;
			}
		}
		System.out.println(employee.indexOf(employee2));
		
//		double tempsal=Double.MAX_VALUE;
//		
//		Employee employee2=new Employee();
//		
//		for(Employee emp:employee) {
//			if(emp.salary<=tempsal) {
//				tempsal=emp.salary;
//				employee2=emp;	
//			}
//		}
		return employee2;
	}
	
	
	
	
	//write a method which accepts list of employees and returns average salary.

	public double averagesalary(ArrayList<Employee> list) {
		double tot=0;
	    int arrsize=list.size();
	  for(Employee emp:list) {
		  tot=tot+emp.salary;
	  }
		
	 double avg=tot/arrsize;
		return avg;
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		ArrayList<Employee> list =new ArrayList<>();
//		list.add(new Employee("naresh",45000));
//		list.add(new Employee("naveen",40000));
//		list.add(new Employee("benerji",10000));
//		list.add(new Employee("pavan",60000));
//		list.add(new Employee("jagadeesh",50000));
		
		
		FinalTest test=new FinalTest();
		
		    Employee maxsalaryemp=test.minSalary(list);
		
		System.out.println(maxsalaryemp);
		
		
		
		
	 //double avgsalary=	test.averagesalary(list);
	// System.out.println(avgsalary);
		
	}
}
	
	
	class Products{
		String name;
		int price;
		
		
		public Products(String name,int price) {
			this.name=name;
			this.price=price;
		}


		public Products() {
			// TODO Auto-generated constructor stub
		}
		public String toString() {
			return new String("name:"+this.name+"  "+ " price:"+this.price);
			
		}
		
	}
	
	

