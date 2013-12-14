package org.thenewboston.beginner.b37;

public class main {
  public static void main(String[] args) {
  	DisplayRegularTime tunaObject = new DisplayRegularTime();
    System.out.println(tunaObject.toMilitary());
    System.out.println(tunaObject.toString());
    
    tunaObject.setTime(13, 27, 6);
    System.out.println(tunaObject.toMilitary());
    System.out.println(tunaObject.toString());
 }
}
