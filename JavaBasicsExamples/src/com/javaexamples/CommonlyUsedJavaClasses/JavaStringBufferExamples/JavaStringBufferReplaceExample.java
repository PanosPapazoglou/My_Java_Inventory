package com.javaexamples.CommonlyUsedJavaClasses.JavaStringBufferExamples;

/*
Java StringBuffer Replace Example
This example shows how contents of java StringBuffer can be replaced using
replace method of Java StringBuffer class.
*/

public class JavaStringBufferReplaceExample {

public static void main(String[] args) {

 //Create the StringBuffer object
 StringBuffer sb = new StringBuffer("Hello World");
 System.out.println("Original Text : " + sb);

 /*
  To replace the contents of Java StringBuffer use
  StringBuffer replace(int start, int end, String str) method.
  It replaces the content from StringBuffer string from start index
  to end - 1 index by the content of the String str.
 */
 
 sb.replace(0,5,"Hi");
 
 System.out.println("Replaced Text : " + sb);



}
}

/*
Output would be
Original Text : Hello World
Replaced Text : Hi World
*/