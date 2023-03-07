package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		
		String[] arr= {"naveen","naresh","jagadeesh","pavan"};
		
		List<String> list= Arrays.asList(arr);
		
		
		ArrayList<List> newarray=new ArrayList();
		newarray.add(list);
		//System.out.println(newarray);
		list.toArray();
		for(List str:newarray) {
			System.out.println(str);
			for(Object st:str) {
				System.out.println(st);
			}
		}
//		for(List str:newarray) {
//			System.out.println(str);
//			for(Object st:str) {
//				System.out.println(st);
//			}
//		}
		
//		for(String str:list) {
//			System.out.println(str);
//		}
		
		//ArrayList<Product> list=new ArrayList<Product>();
		
		/*
		 * ArrayList<String> list2=new ArrayList<>();
		 * 
		 * list2.add("Jagadeesh"); list2.add("naveen"); list2.add("naresh");
		 * list2.add("pavan"); list2.add("praveen");
		 * 
		 * ListIterator<String> listitr=list2.listIterator(list2.size());
		 * 
		 * // while(listitr.hasNext()) { // listitr.next(); // }
		 * while(listitr.hasPrevious()) { listitr.
		 * System.out.println(listitr.previous()); }
		 */
	  
		
		/*
		 * ar.add(new Scanner(System.in)); Scanner sc=(Scanner) ar.get(0); int
		 * readnum=sc.nextInt(); System.out.println(readnum); //System.out.println(ar);
		 */	}
	
	 
    public static ArrayList<Product> getlist() {
    	Product prs=new Product();
    	
    		ArrayList<Product> list=new ArrayList<Product>();
    		
    	    if(prs.rs>100) {
    		
    	    }
    	    return list;
    	}
    		
    	
    }


