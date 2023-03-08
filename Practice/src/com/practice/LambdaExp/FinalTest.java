package com.practice.LambdaExp;

public class FinalTest {
	public static void main(String[] args) {
		
		InterfaceOne ref=(x,y) -> (x+y);
		
		InterfaceOne ref2=(x,y) -> x*y;
		int res2=ref2.test(2, 2);
		System.out.println(res2);
		int res=ref.test(4,4);
		System.out.println(res);
	}

}
