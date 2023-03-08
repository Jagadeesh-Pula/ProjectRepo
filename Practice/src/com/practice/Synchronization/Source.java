package com.practice.Synchronization;

import java.util.Iterator;

public class Source {
	
	public Source() {
		
	}
	
	public synchronized void  tablePrint(int c) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(c+" X "+ i +" = "+ c*i);
			
		}
	}

}
