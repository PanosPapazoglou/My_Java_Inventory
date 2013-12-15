package org.thenewboston.intermediate.i10;

import java.util.*;

public class MethodsReverseAndCopy {
  public static void main(String[] args) {

    //create an array and convert to list
    Character[] ray = {'p', 'w', 'n'};
    List<Character> l = Arrays.asList(ray);
    
    System.out.println("List is: ");
    //output(l);
    
    //reverse and printout the list
    Collections.reverse(l);
    System.out.println("after reverse: ");
    //output(l);
    
    //create new array and new list
    Character[] newRay = new Character[3];
    List<Character> listCopy = Arrays.asList(newRay);
    
    //copy contents of List l to List listCopy
    Collections.copy(listCopy, l);
    
  }
}
