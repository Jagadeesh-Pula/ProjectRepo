package com.practice;

import java.util.List;
import java.util.Spliterator;

public class Main2 {
	public static void main(String[] args) {

//		String str="Jagadeesh ".repeat(12);
//		
//        System.out.println(str);
//        
//        String fmt="My name is %s and my age is %d ";
//        String msg=String.format(fmt, "Jagadeesh",21);
//       
//        System.out.println(msg);
//        
        
        List<String> duckFood = List.of("sweetcorn", "lettuce", "peas", "seeds", "rice");

        Spliterator<String> bag1 = duckFood.spliterator();
        Spliterator<String> bag2 = bag1.trySplit();

        bag1.forEachRemaining(System.out::println); // Prints: peas, seeds, rice
        System.out.println();
        bag2.forEachRemaining(System.out::println); // Prints: sweetcorn, lettuce
        
	}
}
