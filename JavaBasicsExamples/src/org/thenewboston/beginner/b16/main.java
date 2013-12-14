package org.thenewboston.beginner.b16;

import java.util.Scanner;

public class main {

	public static void main(String args[]){
	   
    Scanner input = new Scanner(System.in);
    ManyMethodsAndInstances tunaObject = new ManyMethodsAndInstances();
    System.out.println("Enter name of first gf here: ");
    String temp = input.nextLine();
    tunaObject.setName(temp);
    tunaObject.saying();
    
	}

}
