package org.thenewboston.intermediate.i17;

import java.util.*;

public class GenericMethods {
  public static void main(String[] args) {

    Integer[] iray = {1, 2, 3, 4};
    Character[] cray = {'b', 'u', 'c', 'k', 'y'};

    printMe(iray);
    printMe(cray);

 }

 public static void printMe(Integer[] i) {
     for(Integer x : i) {
         System.out.printf("%s ", x);
     }

     System.out.println();
 }

 public static void printMe(Character[] i) {
     for(Character x : i) {
         System.out.printf("%s ", x);
     }

     System.out.println();
 }
}
