package com.practice.Set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
		Set<String> list=new HashSet<>();
		list.add("naveen");

		list.add("jagadeesh");
		list.add("naresh");
		list.add("benerji");
		list.remove("Naresh");
		System.out.println(list);
	}

}
