package com.practice.QA;

public class Main {
	public static void main(String[] args) {
		
		Integer num=5555;
		int temp=0;
		int sum=0;
		int sum2=0;
	    while(num>0){
	    	temp=num%10;
	    	sum=sum+temp;
	    	num=num/10;
	    }
	    int number2=sum;
	    
	    while(number2>0){
	    	temp=number2%10;
	    	sum2=sum2+temp;
	    	number2=number2/10;
	    }
	    System.out.println(sum2);
		//}
	}

}
