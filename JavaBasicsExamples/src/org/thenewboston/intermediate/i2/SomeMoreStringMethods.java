package org.thenewboston.intermediate.i2;

public class SomeMoreStringMethods {

  public static void main(String[] args) {

    String s = "buckyrobertsbuckyroberts";

    // Search for the first instance of k
    // Returns..3
    System.out.println(s.indexOf("k"));
    
    //Search for the first instance of the string rob after the position 10 (starting from 0)
    System.out.println(s.indexOf("rob", 10));

    //Search for x that is not there...returns -1 or false..
    System.out.println(s.indexOf("x"));

    // -----------------------------------------------------------------------------------------//
    
    String a = "BACON ";
    String b = "monster";
    String c = "     flying        ";

    // To add strings we use..concatanation or Strings special overload sign for concatanation +
    System.out.println(a.concat(b));
    System.out.println(a+b);
    
    // To replace a character or a string with another string..
    System.out.println(a.replace('B', 'F'));
    System.out.println(a.replace("BA", "FO"));

    // Convert all characters of the b String object to UpperCase
    System.out.println(b.toUpperCase());

    // Convert all characters of the a String object to LowerCase    
    System.out.println(a.toLowerCase());
  
    // Eliminate spaces from c String Object
    System.out.println(c.trim());

  }
  
}
