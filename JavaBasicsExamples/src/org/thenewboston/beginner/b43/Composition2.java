package org.thenewboston.beginner.b43;

public class Composition2 {
  public int month;
  public int day;
  public int year;
  
  public Composition2(int m, int d, int y){
     month = m;
     day = d;
     year = y;
     
     System.out.printf("The constructor for this is %s\n", this);
  }
  
  public String toString(){
     return String.format("%d/%d/%d", month, day, year);
  }

}
