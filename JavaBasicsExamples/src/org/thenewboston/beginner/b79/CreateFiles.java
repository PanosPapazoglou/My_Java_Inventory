package org.thenewboston.beginner.b79;

import java.util.Formatter;

public class CreateFiles {
	
  public static void main(String args[ ]) {
    final Formatter f;
    
    try {
       f = new Formatter("src\\org\\thenewboston\\beginner\\b79\\5.txt");
       System.out.println("File created!!");
    } catch (Exception e) {
       System.out.println("you have an error");   
    }
 }
  
}
