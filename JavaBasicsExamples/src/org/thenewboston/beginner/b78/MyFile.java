package org.thenewboston.beginner.b78;

import java.io.File;

public class MyFile {
	
  public static void main(String args[ ]) {
    File f = new File("5.jpg");
    if(f.exists())
       System.out.println(f.getName() + " exists!");
    else
       System.out.println("There is no such file.");
 }
  
}
