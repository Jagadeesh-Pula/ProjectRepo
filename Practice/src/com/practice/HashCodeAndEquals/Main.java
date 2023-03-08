package com.practice.HashCodeAndEquals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Product> set=new TreeSet<>();
		set.add(new Product("paste", 500, 2024));
		set.add(new Product("brush", 50, 2021));
		set.add(new Product("cakes", 100, 2023));
		set.add(new Product("bag", 5000, 2020));
		set.add(new Product("bag", 5000, 2020));
		
		
		Iterator<Product> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
