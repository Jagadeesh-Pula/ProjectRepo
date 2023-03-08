package com.practice;

import java.util.Iterator;

public class IntToHexaDecimal {
	public static void main(String[] args) {
		
		IntToHexaDecimal obj=new IntToHexaDecimal();
		String result=obj.hexaDecimalConverter(17655);
//		
		System.out.println(result);
//		
         System.out.println(Integer.toHexString(17655));
//		
//		System.out.println(obj.octalConverter(5212));
//		System.out.println(Integer.toOctalString(5212));
		
		
		
	}
	
	public String hexaDecimalConverter(int value) {
		
		int rem;
		String result=""; 
		char[] ch= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		 while(value>0)  
		    {  
		       rem=value%16;   
		       result=ch[rem]+result;   
		       value=value/16;  
		    }  
		    return result;  
		
	}
	
	public  String octalConverter(int value){    
	    int rem;   
	    String result=""; 
	    char ch[]={'0','1','2','3','4','5','6','7'};  
	    
	    while(value>0)  
	    {  
	       rem=value%8;   
	       result=ch[rem]+result;   
	       value=value/8;  
	    }  
	    return result;  
	}    
	
	
	

}
