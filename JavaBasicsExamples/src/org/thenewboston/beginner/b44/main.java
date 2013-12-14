package org.thenewboston.beginner.b44;

public class main {
  public static void main(String[] args){
    for(MyEnumeration people: MyEnumeration.values())         
       System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
 }
}
