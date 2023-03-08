package com.practice.ObjectCreation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException 
	{
		// using new operator 
		Order order1 = new Order();
		System.out.println(order1.hashCode());
		
		// using clone method
		Order newOrder = (Order) order1.clone();
		
		File fileOutput = new File("C:\\files\\file2.txt");		
//
//		// serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileOutput));
		Order order11 = new Order(1010, "food", 2021, 300.00);
        System.out.println(order11);
		System.out.println(order11.hashCode()); //  366712642
		oos.writeObject(order1);
		oos.flush();
		oos.close();
//		
//		// using Deserilization 
		FileInputStream fis = new FileInputStream(fileOutput);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Order oreder12 = (Order) ois.readObject();
		System.out.println(oreder12);
		System.out.println(oreder12.hashCode());
		ois.close();
		fis.close();
		
		// using newInstance() method of Class class 
		Order order = Order.class.newInstance();
		order.setOrdNum(1020);
		order.setType("food");
		order.setOrdYear(2021);
		order.setOrdCost(4000);
		System.out.println(order);
		
		System.out.println(order.hashCode());
		// using newInstance() method of Constructor class
		Constructor<Order> ordConstructor = Order.class.getConstructor();
		Order order3 = ordConstructor.newInstance();
		System.out.println(order3);
		System.out.println(order3.hashCode());
		
		
		Class<Order> classObject = (Class<Order>) Class.forName("com.dhathika.ann.Order");
		classObject.newInstance();
		
	}
}
