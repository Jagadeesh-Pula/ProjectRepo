package com.practice.Synchronization;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> copyarraylist=new CopyOnWriteArrayList<>();
		ArrayListAdder arraylist=new ArrayListAdder(new ArrayList<>());
		ArrayListAdder copyarraylistadder=new ArrayListAdder(copyarraylist);
		
		
		ThreadTwo one=new ThreadTwo(copyarraylistadder);
     	one.start();
		
     	ThreadTwo two=new ThreadTwo(copyarraylistadder);
     	two.start();
     	
     	ThreadTwo three=new ThreadTwo(copyarraylistadder);
     	three.start();
     	
     	ThreadTwo four=new ThreadTwo(copyarraylistadder);
     	four.start();
		
		
//		Source source =new Source();
//		
//		ThreadOne one=new ThreadOne(12, source);
//		one.start();
//		
//		ThreadOne two=new ThreadOne(15, source);
//		two.start();
		
	}

}
