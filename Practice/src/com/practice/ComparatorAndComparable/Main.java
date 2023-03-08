package com.practice.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		 List<Product> hashset=new LinkedList<>();
		
        hashset.add(new Product("apples", 200, 2020));
        hashset.add(new Product("Paste", 100, 2021));
        hashset.add(new Product("Biscuts", 300, 2022));
        hashset.add(new Product("Chacholates", 150, 2020));
		
//       Collections.sort(hashset,new Comparator<Product>() {
//
//		@Override
//		public int compare(Product o1, Product o2) {
//			if(o1.getCost()>o2.getCost())
//				return 1;
//			else if(o1.getCost()<o2.getCost())
//				return -1;
//			else
//			return 0;
//		}
//    	   
//    	   
//	});
        Collections.sort(hashset,new Comparator<Product>() {

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
		for(Product pr:hashset) {
			System.out.println(pr);
		}
		
//         List<Product> hashset=new LinkedList<>();
//		
//         hashset.add(new Product("apples", 200, 2020));
//         hashset.add(new Product("Paste", 100, 2021));
//         hashset.add(new Product("Biscuts", 300, 2022));
//         hashset.add(new Product("Chacholates", 150, 2020));
//		
//        Collections.sort(hashset);
//         
//		for(Product pr:hashset) {
//			System.out.println(pr);
//		}
		
		
	}

}
