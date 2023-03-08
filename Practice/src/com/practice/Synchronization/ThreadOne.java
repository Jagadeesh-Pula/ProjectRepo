package com.practice.Synchronization;

public class ThreadOne extends Thread {
	int number;
	public Source source;
	public ThreadOne(int number, Source source) {
		this.number = number;
		this.source = source;
	}
	
	@Override
	public void run() {
		
		this.source.tablePrint(this.number);
	}
	
	

}
