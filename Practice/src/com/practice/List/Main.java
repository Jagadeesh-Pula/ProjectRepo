package com.practice.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Order> orderList=new ArrayList<>();
		
		orderList.add(new Order(200,"biscuts",2020));
		orderList.add(new Order(300,"chacolets",2021));
		orderList.add(new Order(100,"paste",2020));
		orderList.add(new Order(60,"brush",2019));
		orderList.add(new Order(60,"brush",2019));
		orderList.add(new Order(60,"brush",2019));
		
		Collections.sort(orderList);
		for(Order ord:orderList) {
			System.out.println(ord);
		}
//		
//		List<String> list=new ArrayList<>();
//		list.add("naveen");
//		list.add("naresh");
//		list.add("jagadeesh");
//		list.add("benerji");
//		list.add("suresh");
//		for(String str:list) {
//			System.out.println(str);
//		}
		
	}
	

}
