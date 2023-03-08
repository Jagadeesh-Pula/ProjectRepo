package com.practice;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiners {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("naveen");
		list.add("naresh");
		list.add("jagadeesh");
		list.add("kumar");
		
		
		StringJoiner strj=new StringJoiner(" - ");
		
		for(String st: list) {
			strj.add(st);
			
		}
		System.out.println(strj);
	}
	
	
	

}
