package org.thenewboston.beginner.b28;

public class CreatingAnArrayTable {

  public static void main(String[] args){
    System.out.println("Index\tValue");
    int buck[]={32,12,18,54,2};

    for(int counter=0;counter<buck.length;counter++){
       System.out.println(counter + "\t" + buck[counter]);
    }
 }

}
