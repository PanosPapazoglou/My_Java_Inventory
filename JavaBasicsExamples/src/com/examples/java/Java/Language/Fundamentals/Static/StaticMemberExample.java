package com.examples.java.Java.Language.Fundamentals.Static;

/*
Java static member variable example
This Java Example shows how to declare and use static member variable inside
a java class.
*/

public class StaticMemberExample {

	public static void main(String[] args) {
	       
	        ObjectCounter object1 = new ObjectCounter();
	        System.out.println(object1.getNumberOfObjects());
	       
	        ObjectCounter object2 = new ObjectCounter();
	        System.out.println(object2.getNumberOfObjects());
	                       
	}
	
}
