package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Practice2 {
	
	
	public static void main(String[] args) {
		
//		ArrayList<String> list=new ArrayList<>();
//		
//		list.add("NaveenKumar");
//		list.add("naresh");
//		list.add("kumar");
//		list.add("JagadeeshBabuPula");
//		list.add("PavanKumarNaidu");
//		list.add("benerji");
		Practice2 pr=new Practice2();
		ArrayList<Employee> list=new ArrayList<>();
		
		list.add(new Employee("naresh",50000,"Hyderabad"));
		list.add(new Employee("naveen",60000,"Goa"));
		list.add(new Employee("jagadeesh",70000,"Hyderabad"));
		list.add(new Employee("pavan",80000,"Chennai"));
		list.add(new Employee("kumar",90000,"Hyderabad"));
		list.add(new Employee("benerji",10000,"Bangalore"));
		list.add(new Employee("abhi",90000,"Bangalore"));
		ArrayList<Employee> arrlist=pr.employeefilter(list,50000,"Hyderabad");
		
		for(Employee emp:arrlist) {
			System.out.println(emp);
		}
		
		
	}
	
	public ArrayList<Employee> employeefilter(ArrayList<Employee> emp,int salary,String location){
		ArrayList<Employee> list=new ArrayList<>();
		for(Employee employee:emp) {
			if(employee.salary>salary && employee.location==location) {
				list.add(employee);
			}
		}
		
		return list;
	}
	
	
	public ArrayList<String> greatervalues(ArrayList<String> strlist){
		
		ArrayList<String> newStr=new ArrayList<>();
		for(String str: strlist) {
			if(str.length()>10) {
				strlist.add(str);
			}
		}
		 
		return newStr;
	}

}
