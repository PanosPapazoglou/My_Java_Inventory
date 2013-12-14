package org.thenewboston.beginner.b48;

public class main {
  public static void main(String[] args){
  	MyFinal myObject = new MyFinal(10);
    
    for(int i=0; i<5;i++){
    	 myObject.add();
       System.out.printf("%s", myObject);
    }
 }
}
