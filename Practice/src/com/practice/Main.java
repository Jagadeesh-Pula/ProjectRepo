package com.practice;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	
//		int number = 501;
//		int rem;
//		StringBuffer sbr = new StringBuffer();
//		while(number>0) {
//			rem = number%2;
//			sbr.append(rem);
//			number = number/2;
//			
//		}
//		System.out.println(sbr.reverse());
//		System.out.println(Integer.toBinaryString(501));
//		System.out.println(501/2);
		Main m=new Main();
		m.primenumbers(100);
		
		String str="Jagadeesh";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0;i--) {
			
			System.out.println(i);
		}
		
	}
	
	
	
	public void primenumbers(int Num){
		 ArrayList<Integer> primeList  = new ArrayList<Integer>();
		  int fact = 0;
           for(int i = 1; i <= Num ; i++) {
           	
           	for(int j = 1; j<=i; j++) {
           		if(i%j == 0) {
           			fact++;
           		}
           	}
           	if(fact <= 2 ) {
           		primeList.add(i);
           	}
           	fact = 0;
           }
		 // System.out.println(primeList);
		
	}

}
