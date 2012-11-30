package com.examples.java.Java.Language.Fundamentals.Do.While.Loop;

/*
Do While loop Example
This Java Example shows how to use do while loop to iterate in Java program.
*/

public class DoWhileExample {

public static void main(String[] args) {
 
  /*
   * Do while loop executes statment until certain condition become false.
   * Syntax of do while loop is
   *
   * do
   *   <loop body>
   * while(<condition>);
   *
   * where <condition> is a boolean expression.
   *
   * Please not that the condition is evaluated after executing the loop body.
   * So loop will be executed at least once even if the condition is false.
   */

  // Se antithesi me to for loop... edo tha ektelestei toulaxiston tin 1i fora to do...body...
  // kai meta tha tsekarei gia to an tha xana ektelestei.. 	
	
  int i =0;  
 
  do
  {
    System.out.println("i is : " + i);
    i++;
   
  }while(i < 5);
 
}
}

/*
Output would be
i is : 0
i is : 1
i is : 2
i is : 3
i is : 4
*/