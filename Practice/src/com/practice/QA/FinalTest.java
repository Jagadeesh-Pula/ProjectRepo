package com.practice.QA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FinalTest {
	
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Jagadeesh", 50000));
		list.add(new Employee(102, "Naveen", 4000));
		list.add(new Employee(103, "Naresh", 5000));
		list.add(new Employee(104, "Pavan", 60000));
		list.add(new Employee(105, "Benerji", 10000));
		empFilterWithLambDa(list);
		
		
	}
	
	public static void empFilter(ArrayList<Employee> list) {
		Predicate<Employee> pr=new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				if(t.getSalary()<20000) {
					return true;
				}else
				return false;
			}
		};
		Consumer<Employee> con=new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				double increase=t.getSalary()*0.04;
				t.setSalary(t.getSalary()+increase);
			}
		};
		list.stream().filter(pr).forEach(con);
		for(Employee em: list) {
			System.out.println(em);
		}
	}
	
	public static void empFilterWithLambDa(ArrayList<Employee> list) {
		list.stream()
		.filter(t -> t.getSalary()<20000)
		.forEach(t -> {
	    t.setSalary(t.getSalary()+(t.getSalary()*0.04));
		System.out.println(t);});
		
		
//		for(Employee em: list) {
//			System.out.println(em);
//		}
	}

}
