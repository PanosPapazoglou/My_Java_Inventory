package org.thenewboston.beginner.b41;

public class main {

  public static void main(String[] args){
    
  	BuildingObjectsForConstructors myObject = new BuildingObjectsForConstructors();
  	BuildingObjectsForConstructors myObject2 = new BuildingObjectsForConstructors(5);
  	BuildingObjectsForConstructors myObject3 = new BuildingObjectsForConstructors(5,13);
  	BuildingObjectsForConstructors myObject4 = new BuildingObjectsForConstructors(5,13,43);
    
    System.out.printf("%s\n", myObject.toMilitary());
    System.out.printf("%s\n", myObject2.toMilitary());
    System.out.printf("%s\n", myObject3.toMilitary());
    System.out.printf("%s\n", myObject4.toMilitary());
    
 }
	
	
}
