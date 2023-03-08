package com.practice.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class FinalTest {
	public static void main(String[] args) {
		Map<Integer, String> csMap=new ConcurrentSkipListMap<>();
		
		Integer n=9;
		csMap.put(n, "Jagadeesh");
		csMap.put(2, "naresh");
		csMap.put(8, "pavan");
		csMap.put(4, "naveen");
		csMap.put(6, "suresh");
		Set<Entry<Integer, String>> entry=csMap.entrySet();
		Iterator itr=entry.iterator();
		while(itr.hasNext()) {
			//itr.next();
			csMap.remove(n);
		}
		
//		for(Entry en:entry) {
//			System.out.println(en);
//		}
		
		
Map<Integer, String> tMap=new TreeMap<>();
		
		
		tMap.put(n, "Jagadeesh");
		tMap.put(2, "naresh");
		tMap.put(8, "pavan");
		tMap.put(4, "naveen");
		tMap.put(6, "suresh");
		Set<Entry<Integer, String>> entry2=csMap.entrySet();
		Iterator itr2=entry2.iterator();
		while(itr2.hasNext()) {
			//itr.next();
			csMap.remove(n);
		}
		
	}

}
