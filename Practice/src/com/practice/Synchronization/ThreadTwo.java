package com.practice.Synchronization;

public class ThreadTwo extends Thread{
	
	ArrayListAdder arraylist;

	public ThreadTwo(ArrayListAdder arraylist) {
		
		this.arraylist = arraylist;
	}
	
	@Override
	public void run() {
		System.out.println(arraylist.adding());
	}
	

}
