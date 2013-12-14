package org.thenewboston.beginner.b38;

public class main {
  public static void main(String[] args) {
  	PublicPrivateAndThis tunaObject = new PublicPrivateAndThis();
    System.out.println(tunaObject.toMilitary());
    System.out.println(tunaObject.toString());
    
    tunaObject.setTime(13, 27, 6);
    System.out.println(tunaObject.toMilitary());
    System.out.println(tunaObject.toString());
 }
}
