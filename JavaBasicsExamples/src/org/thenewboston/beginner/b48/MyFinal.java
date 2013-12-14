package org.thenewboston.beginner.b48;

public class MyFinal {
  private int sum;
  private final int NUMBER;
  
  public MyFinal(int x){
     NUMBER = x;
  }
  public void add(){
     sum+=NUMBER;
  }
  public String toString(){
     return String.format("sum = %d\n", sum);
  }
}
