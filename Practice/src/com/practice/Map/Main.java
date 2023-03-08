package com.practice.Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
	public static void main(String[] args) {
		
		
		Map map8=new EnumMap(Days.class);
		map8.put(Days.Monday, "One");
		map8.put(Days.Tuesday, "two");
		map8.put(Days.Wednesday, "three");
		map8.put(Days.Thrusday, 1.8);
		map8.put(Days.Friday, 1);
		System.out.println(map8);
		
		
		
Map<String, Integer> map7=new ConcurrentHashMap<String, Integer>();
		
		map7.put("Jagadeesh", 1);
		map7.put("naveen", 2);
		map7.put("naresh", 3);
		map7.put("pavan", 4);
		map7.put("suresh", 5);
		
		
         Set<Entry<String, Integer>> entry7=  map7.entrySet();
		
      Iterator itr7= entry7.iterator();
      
//      while(itr7.hasNext()) {
//    	 System.out.println( itr7.next());
//    	 map7.put("kumar", 5);
//    	 
//      }
      
//		for(Entry en: entry7){
//			System.out.println(en);
//		}
//		
		Map<String, Integer> map6=new LinkedHashMap<String, Integer>();
		
		map6.put("Jagadeesh", 1);
		map6.put("naveen", 2);
		map6.put("naresh", 3);
		map6.put("pavan", 4);
		map6.put("suresh", 5);
		map6.put(null, 5);
		map6.put(null, 6);
		map6.put(null, 8);
		
		
         Set<Entry<String, Integer>> entry6=  map6.entrySet();
		
//		for(Entry en: entry6){
//			System.out.println(en);
//		}
//	
		Map<Integer, String> map2=new Hashtable<Integer, String>();
		Map<String, String> map4=new Hashtable<String, String>();
		map2.put(4, "four");
		map2.put(1, "One");
		map2.put(5, "Two");
		map2.put(3, "three");
		map2.put(2, "Two");
		map2.put(8, "Two");
	
	
		map4.put("one", "Jagadeesh");
		map4.put("two", "naveen");
		map4.put("three", "naresh");
		map4.put("four", "pavan");
		map4.put("five", "suresh");

		Set<Entry<Integer, String>> entry2=  map2.entrySet();
		
//		for(Entry en: entry2){
//			System.out.println(en);
//		}
		
        Set<Entry<String, String>> entry4=  map4.entrySet();
		
//		for(Entry en: entry4){
//			System.out.println(en);
//		}
		
		Map<Integer, String> map=new TreeMap<Integer, String>();
		map.put(4, "four");
		map.put(1, "One");
		map.put(3, "three");
		map.put(2, "Two");
		map.put(8, "Two");
		
		
		Set<Entry<Integer, String>> entry=  map.entrySet();

//		for(Entry en: entry){
//			System.out.println(en);
//		}
		
		//we will get concurent modification exception if we use hashmap 
		//Map<Employee, String> map3=new HashMap<Employee, String>();
		Map<Employee, String> map3=new ConcurrentHashMap<Employee, String>();
		Employee emp1=new Employee(1, "Jagadeesh");
		Employee emp2=new Employee(2, "naresh");
		Employee emp3=new Employee(3, "naveen");
		Employee emp4=new Employee(4, "pavan");
		Employee emp5=new Employee(5, "suresh");
		map3.put(emp1, "one");
		map3.put(emp2, "two");
		map3.put(emp3, "three");
		map3.put(emp4, "four");
		
		Set<Entry<Employee, String>> entry1=  map3.entrySet();
		 Iterator itr1= entry1.iterator();
		
	      while(itr1.hasNext()) {
//	    	  Map.Entry<Employee, String> entry9 = (Map.Entry<Employee,String>) itr1.next();
//	    	  Employee emp=entry9.getKey();
//	    	  String str=entry9.getValue();
//	    	  System.out.print(emp);
//	    	  System.out.println(str);
	//    	  System.out.println(itr1.next());
	    	 map3.remove(emp4);
	    	  
	    	 
	      }
		Map<Integer, String> map5=new IdentityHashMap<Integer, String>();
		map5.put(4, "four");
		map5.put(1, "One");
		map5.put(1, "three");
		map5.put(1, "Two");
		map5.put(new Integer(1),"dummy");
		
//		System.out.println("hash map size :"+map3.size());
//		System.out.println("identity map size :"+map5.size());
//		
		//Set<Integer> keyset=map2.keySet();
//		for(Integer in: keyset) {
//			System.out.println(in);
//		}
		
//		String str="Jagadeesh";
//		if(str.equals("Jagadeesh")) {
//			System.out.println("condition true");
//		}
//		if(str =="Jagadeesh") {
//			System.out.println("condition true");
//		}
		
		
	}

}
