package com.practice.Thread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(3 +" x " +i+" = "+3*i);
		}
		
	}

	
}
