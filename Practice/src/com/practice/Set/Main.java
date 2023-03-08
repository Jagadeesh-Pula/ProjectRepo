package com.practice.Set;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Set<Order> list=new HashSet<Order>();
		list.add(new Order(200,"biscuts",2020));
		list.add(new Order(500,"paste",2021));
		list.add(new Order(100,"shampoo",2019));
		list.add(new Order(800,"chacolets",2023));
		Order or=new Order();
		list.remove("paste");
		ListIterator<Order> itr=(ListIterator<Order>) list.spliterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		
		System.out.println(list);
//		for(Order ord:list) {
//		System.out.println(ord.getName().equalsIgnoreCase("paste"));
//		list.remove(ord);
//		}
		
	}

}
