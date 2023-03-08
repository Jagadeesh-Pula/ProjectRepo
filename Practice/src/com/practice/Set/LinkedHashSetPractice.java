package com.practice.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		Set<String> list=new LinkedHashSet<>();    // follows insertion order & same as HashSet but underlying strcture is LinkedHashMap
		list.add("naveen");
		list.add("naresh");
		list.add("jagadeesh");
		list.add("benerji");
		list.add("suresh");
		list.add("benerji");
		list.add("Benerji");
		
		
		for(String str:list) {
			System.out.println(str);
		}
	}

}
