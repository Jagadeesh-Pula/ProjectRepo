package com.practice;

import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		
		Student s = new Student(1, "jagadeesh", 'M', "SSDC", "Madanapalle", (float) 76.0);
		Student ss[]=new Student[100];
		for(int i=0;i<ss.length;i++) {
			ss[i]=s;
		}
		int i=4;
		char ch[]= {'J','A','G','A','D','E','E','S','H'};
		//System.out.println(ch);
		//System.out.println(i);
		
		ArrayList al=new ArrayList();
		al.add(new Integer(1));
		al.add(new String("jagadeesh"));
		al.add("2");
		al.add("Naresh");
		al.add(s);
		for(int ii=0;ii<100;ii++) {
			al.add(new Integer(ii));
		}
		System.out.println("end of the loop");
	}

}
