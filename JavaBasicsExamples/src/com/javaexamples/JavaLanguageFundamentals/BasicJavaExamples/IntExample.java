package com.javaexamples.JavaLanguageFundamentals.BasicJavaExamples;

/*
Java Interface example.
This Java Interface example describes how interface is defined and
being used in Java language.
 
Syntax of defining java interface is,
<modifier> interface <interface-name>{
  //members and methods()
}
*/
 
//declare an interface
interface IntExample{
 
  /*
  Syntax to declare method in java interface is,
  <modifier> <return-type> methodName(<optional-parameters>);
  IMPORTANT : Methods declared in the interface are implicitly public and abstract.
  */
 
  public void sayHello();
}