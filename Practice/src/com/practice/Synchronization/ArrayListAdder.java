package com.practice.Synchronization;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdder {
	List<String> list;

	public ArrayListAdder(List<String> list) {
		
		this.list = list;
	}
	
	public synchronized int adding() {
		for (int i = 0; i <= 100; i++) {
			this.list.add("String :"+i);
			
		}
		return this.list.size();
	}
	

}
