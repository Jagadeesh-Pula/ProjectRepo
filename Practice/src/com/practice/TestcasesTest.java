package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestcasesTest {
   Testcases obj=new Testcases();
	@Test
	void testMaxSalary() {
		
	ArrayList<Employee> list=new ArrayList<>(); 
//	list.add(new Employee("jagadeesh",50000));
//	list.add(new Employee("naveen",60000));
//	list.add(new Employee("naresh",80000));
//	list.add(new Employee("benerji",10000));
//	list.add(new Employee("pavan",55000));
	
	assertEquals(80000, obj.maxSalary(list));
	
	}
	@Test
	void testIntegerValues() {
		int n=0;
		for(int i=0;i<100;i++) {
			n=i;
		}
		assertEquals(99, n);
	}

}
