package com.practice.Cloneable;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address("Diguvapalle", "Diguavapalle", 517427);
		User user=new User("Jagadeesh", 1001, "jagadeesh.pula@gmail.com", address);
		System.out.println("original User hashcode : "+user.hashCode());
		System.out.println("original adress hashcode : "+user.getAddress().hashCode());
		
		User userCloned=(User) user.clone();
		System.out.println("cloned User hashcode : "+userCloned.hashCode());
		System.out.println("cloned address hashcode : "+userCloned.getAddress().hashCode());
		
	}
 
	

}
