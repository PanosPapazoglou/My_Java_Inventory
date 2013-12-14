package org.thenewboston.beginner.b45;

import java.util.EnumSet;

public class main {
  public static void main(String[] args){
    for(EnumSetRange people: EnumSetRange.values())
       System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
          
    System.out.println("\nAnd now fpr the range of constants!!!\n");
    
    for(EnumSetRange people: EnumSet.range(EnumSetRange.kelsey, EnumSetRange.candy))
    System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
 }
}
