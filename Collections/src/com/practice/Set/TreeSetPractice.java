package com.practice.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
public static void main(String[] args) {
	
	Set<Order> orderlist=new TreeSet<Order>();
	orderlist.add(new Order(200,"paste",2021));
	orderlist.add(new Order(600,"fruits",2020));
	orderlist.add(new Order(500,"vegetables",2023));
	orderlist.add(new Order(900,"oil",2019));
	orderlist.add(new Order(100,"brush",2020));
	orderlist.add(new Order(400,"perfume",2020));
	orderlist.add(new Order(500,"vegetables",2023));
	orderlist.add(new Order(700,"vegetables",2023));
	orderlist.add(new Order(500,"vegetables",2023));
	
	for(Order ord:orderlist) {
		System.out.println(ord);
	}
	System.out.println(orderlist.size());
	
	
	
//	Set<String> list=new TreeSet<>();    //ordered & & UnderLying Structure is treeMap
//	list.add("naveen");
//	list.add("naresh");
//	list.add("jagadeesh");
//	list.add("benerji");
//	list.add("suresh");
//	list.add("benerji");
//	list.add("Benerji");
//	
//	
//	for(String str:list) {
//		System.out.println(str);
//	}
}

}
