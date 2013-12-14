package org.thenewboston.beginner.b39;

public class MultipleConstructors {

  private int hour;
  private int minute;
  private int second;
  
  public MultipleConstructors(){
     this(0,0,0);
  }
  public MultipleConstructors(int h){
     this(h,0,0);
  }
  public MultipleConstructors(int h, int m){
     this(h,m,0);
  }
  public MultipleConstructors(int h, int m, int s){
     //setTime(h,m,s);
  }
  
}
