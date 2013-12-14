package org.thenewboston.beginner.b30;

import java.util.Random;

public class ProgressBar {
	
  public static void main(String[] args){
  	int percentage=0;
  	int counter=0;
  	boolean isVisible = true;
  	
    Random rand = new Random();
    int freq[]=new int[7];
    System.out.println("\n\n\n\n\n\n\n");
    System.out.print("\t[");
    for(int i=1;i<=100;i++){
 			 System.out.print("_");
 	 	}
    System.out.println("] (0%)");
    System.out.println("\n\t\t\t\t\t\tPlease Wait, Calculating..");
    
    
    for(int roll=1;roll<500000000;roll++){
       ++freq[1+rand.nextInt(6)];

     	if(counter==5000000){
      	 counter=0;
      	 percentage++;
      	 System.out.println("\n\n\n\n\n\n\n");
      	 for(int i=1;i<=100;i++){
           if(i==1){
         	   System.out.print("\t[");
         	 }
      		 if(i<=percentage){
      			 System.out.print("#");
      		 }else{
      			 System.out.print("_");
      		 }
      	 }
      	 
      	 System.out.println("] ("+percentage+"%)");
         System.out.println("\n\t\t\t\t\t\tPlease Wait, Calculating..");
       } 
       
       counter++;
       
    }

    System.out.println("Face\tFrequency");

    for(int face=0;face<freq.length;face++){
       System.out.println(face+"\t"+freq[face]);
    }
 }
  
}