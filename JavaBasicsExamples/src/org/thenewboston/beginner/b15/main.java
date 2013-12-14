package org.thenewboston.beginner.b15;

import java.util.Scanner;

public class main {

	public static void main(String args[]){
	   
    Scanner input = new Scanner(System.in);
    UseMethodsWithParameters tunaObject = new UseMethodsWithParameters();
    
    System.out.println("Enter your name here: ");
    String name = input.nextLine();
    
    tunaObject.simpleMessage(name);
    
	}

}
