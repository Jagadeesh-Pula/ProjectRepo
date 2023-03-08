package com.practice.StreamsExp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list.add(12);
		list.add(32);
		list.add(34);
		list.add(74);
		list.add(11);
		
		//list.stream().distinct().forEach((s) -> System.out.println("hello"));
		int n=list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		int n3=list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		
	   Comparator<Integer> com=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1>o2) {
				return 1;
			}
			else if(o2>o1) {
				return -1;
			}
			else
			return 0;
		}
	};
		
	
	list.sort( (o1,o2) ->o1.compareTo(o2) );
	System.out.println(list);
		
		//List<Integer> arr=list.stream().sorted().distinct().toList();
		
		//System.out.println(arr);
		Optional<Integer> n2=  list.stream().findFirst();
		//System.out.println(n);
		//System.out.println(n3);
	}

}
