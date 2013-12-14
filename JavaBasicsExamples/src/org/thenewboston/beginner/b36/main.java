package org.thenewboston.beginner.b36;

public class main {

  public static void main(String[] args) {
  	TimeClass tunaObject = new TimeClass();
    System.out.println(tunaObject.toMilitary());
    tunaObject.setTime(13, 27, 6);
    System.out.println(tunaObject.toMilitary());
 }	
	
}
