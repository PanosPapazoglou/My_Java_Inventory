/*
 * Arxiki katastasi / Before Design Pattern
 * -----------------------------------------
 * Exoume loipon stin arxi mia abstract class Duck 
 * i opoia exei ton constructor tis
 * analabanei tis diadikasies quak kai swim afou ola ta subclass tis (idi papias) kolimpane kai kanoun ayto ton ixo
 * kai afinei to kathe eidos na ilopoiisei to pos tha fainontai meso tis display() method
 * 
 */
package SeperateVaryFromNonChangable.before.orig;

public abstract class Duck {
	
	public Duck(){
		// TODO Auto-generated constructor stub		
	}

	// -- All Ducks quacks and Swim - Thats why we put the code here in the abstract class
  // Generaly code for a duck to quack
	public void quack(){
		System.out.println("I am q!");
	}

  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}
	
	
	// -- Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen

	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();


	// Other duck-like methods
	
}
