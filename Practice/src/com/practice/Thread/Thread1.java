package com.practice.Thread;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(2 +" x " +i+" = "+2*i);
		}
		
	}

}
