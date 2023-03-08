package com.practice.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapPractice {
	public static void main(String[] args) {
		// Creating WeakHashMap of numbers
		Map <String, Integer>  numbers = new WeakHashMap ();
		//Map <String, Integer>  numbers = new HashMap ();
		String two = new String("Two");
		Integer twoValue = 2;
		String four = new String("Four");
		Integer fourValue = 4;

		// Inserting elements
		numbers.put(two, twoValue);
		numbers.put(four, fourValue);
		numbers.put(null, 12);
		numbers.put(null, 12);
		numbers.put(null, 12);
		System.out.println("WeakHashMap: " + numbers);

		// Make the reference null
		two = null;

		// Perform garbage collection
		System.gc();

		System.out.println("WeakHashMap after garbage collection: " + numbers);
	}

}
