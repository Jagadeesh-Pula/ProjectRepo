package com.practice.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Product> list=new ArrayList<>();
		HashSet<String> hashset=new HashSet<>();
		list.add(new Product("paste", 200, 2020));
		list.add(new Product("brush", 300, 2022));
		list.add(new Product("biscuts", 100, 2020));
		list.add(new Product("chacolets", 500, 2021));
		list.add(new Product("vegetables", 100, 2024));
		
	
		for(Product pr: list) {
			System.out.println(pr);
		}
		
		System.out.println("-----------------------------------------");
		
		Collections.sort(list, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getYear()>o2.getYear())
					return -1;
				else if(o1.getYear()<o2.getYear())
					return 1;
				else
				return 0;
			}
	
		});
		
		
		for(Product pr: list) {
			System.out.println(pr);
		}
		
		 List<Product> hashset2=new LinkedList<>();
			
		 hashset2.add(new Product("apples", 200, 2020));
		 hashset2.add(new Product("Paste", 100, 2021));
		 hashset2.add(new Product("Biscuts", 300, 2022));
		 hashset2.add(new Product("Chacholates", 150, 2020));
			
//	       Collections.sort(hashset,new Comparator<Product>() {
	//
//			@Override
//			public int compare(Product o1, Product o2) {
//				if(o1.getCost()>o2.getCost())
//					return 1;
//				else if(o1.getCost()<o2.getCost())
//					return -1;
//				else
//				return 0;
//			}
//	    	   
//	    	   
//		});
	        Collections.sort(hashset2,new Comparator<Product>() {

	    		@Override
	    		public int compare(Product o1, Product o2) {
	    			if(o1.getYear()>o2.getYear())
	    				return 1;
	    			else if(o1.getYear()<o2.getYear())
	    				return -1;
	    			else
	    			return 0;
	    		}
	        	   
	        	   
	    	});
			for(Product pr:hashset2) {
				System.out.println(pr);
			}
			
//	         List<Product> hashset=new LinkedList<>();
//			
//	         hashset.add(new Product("apples", 200, 2020));
//	         hashset.add(new Product("Paste", 100, 2021));
//	         hashset.add(new Product("Biscuts", 300, 2022));
//	         hashset.add(new Product("Chacholates", 150, 2020));
//			
//	        Collections.sort(hashset);
//	         
//			for(Product pr:hashset) {
//				System.out.println(pr);
//			}
			
		
	}

}
