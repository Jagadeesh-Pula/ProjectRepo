package com.practice.Inheritance;

class Animal{  
void printColor() {
	
	System.out.println("white");
}
}  


class Dog extends Animal{
	
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
super.printColor();//prints color of Animal class  
  }

} 

public class TestSuper1{  
	
public static void main(String args[]){  
	
   Dog d=new Dog();  
   d.printColor();  
 }

}  