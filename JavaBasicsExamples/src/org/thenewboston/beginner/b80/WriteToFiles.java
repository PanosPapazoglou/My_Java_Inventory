package org.thenewboston.beginner.b80;

import java.util.Formatter;

public class WriteToFiles {
	
  private Formatter f;
  
  void openFile() {
     try {
        f = new Formatter("src\\org\\thenewboston\\beginner\\b80\\U1.txt");
     } catch(Exception e) {
        System.out.println("You have an error");   
     }
  }
  
  void recordFile() {
     f.format("%s %s %s", "Mr", "Somebody", "20");   
  }
  
  void closeFile() {
     f.close();   
  }
  
}
