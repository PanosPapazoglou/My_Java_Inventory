package org.thenewboston.beginner.b43;

public class Composition {
  private String name;
  private Composition2 birthday;
  
  public Composition(String theName, Composition2 theDate){
     name = theName;
     birthday = theDate;
  }
  
  public String toString(){
     return String.format("My name is %s, my birthday is %s", name, birthday);
  }
  
}
