package com.practice.Thread;

public class FinalTest {
	
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		
		t11.start();
		t22.start();
		
//		t1.run();
//		t2.run();
	}

}
