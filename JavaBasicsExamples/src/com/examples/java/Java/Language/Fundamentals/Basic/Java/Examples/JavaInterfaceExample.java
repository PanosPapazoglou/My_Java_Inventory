package com.examples.java.Java.Language.Fundamentals.Basic.Java.Examples;

/*
Classes are extended while interfaces are implemented.
To implement an interface use implements keyword.
IMPORTANT : A class can extend only one other class, while it can implement n number of interfaces.
*/
 
public class JavaInterfaceExample implements IntExample{
  /*
  We have to define the method declared in implemented interface,
  or else we have to declare the implementing class as abstract class.
  */
 
  public void sayHello(){
    System.out.println("Hello Visitor !");
  }
 
  public static void main(String args[]){
    //create object of the class
    JavaInterfaceExample javaInterfaceExample = new JavaInterfaceExample();
    //invoke sayHello(), declared in IntExample interface.
    javaInterfaceExample.sayHello();
  }
}
 
/*
OUTPUT of the above given Java Interface example would be :
Hello Visitor !
*/