package com.practice.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		Employee emp=new Employee(102, "Jagadeesh", 50000, new Address("Madanapalle", "chembakur", 517417));
		Employee emp2=new Employee(103, "Naveen", 60000, new Address("Madanapalle", "Madapalle", 517325));
		Employee emp3=new Employee(104, "NAresh", 6000, new Address("Hyderabad", "Hyderabad", 560001));
		Employee emp4=new Employee(105, "Benerji", 32000, new Address("Bangalore", "MArathahalli", 560001));
		Employee emp5=new Employee(106, "pavan", 9000, new Address("Madanapalle", "Madapalle", 517417));
		List<Employee> empList=new ArrayList<>();
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Predicate<Employee> pr=new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				if(t.getSalary()>10000)
				return true;
				else
				return	false;
				
			}
		};
		Predicate<Employee> pr2=new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				if(t.getAddress().getCity()!="Hyderabad")
				return true;
				else
				return	false;
				
			}
		};
		
	Consumer<Employee> con=new Consumer<Employee>() {

		public void accept(Employee t) {
			if(t.getAddress().getCity() !="Hyderabad")
			System.out.println(t);	
		}

		
	};
	
	
	empList.stream().filter(pr).forEach(t->{if(t.getAddress().getCity() != "Hyderabad") System.out.println(t);});
		
//		for(Employee em:empList) {
//			System.out.println(em);
//		}
		//System.out.println(empList);
		
	List<Employee> LambdaList=	empList.stream().filter((t)->{if(t.getSalary()>10000) return true; else return false; }).filter((t)->{if(t.getAddress().getCity()!="Hyderabad") return true; else return false; }).toList();
		
//	for(Employee em:LambdaList) {
//		System.out.println(em);
//	}
		
	}

}
