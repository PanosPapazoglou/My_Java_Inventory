package org.thenewboston.beginner.b81;

import java.util.Scanner;
import java.io.File;

public class ReadFromFile {

  private Scanner f;
  private String name, surname, age;
  
  void openFile() {
     try {
        f = new Scanner(new File("src\\org\\thenewboston\\beginner\\b81\\U1.txt"));
     } catch(Exception e) {
        System.out.println("File doesn't exists");   
     }
  }
  
  void printFile() {
     while(f.hasNext()) {
        name = f.next();
        surname = f.next();
        age = f.next();
        
        System.out.printf("%s %s %s\n", name, surname, age);
     }
  }
  
  void closeFile() {
     f.close();   
  }
  
}
