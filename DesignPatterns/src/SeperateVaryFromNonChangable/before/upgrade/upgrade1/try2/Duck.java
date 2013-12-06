/*
 * New Spec 1 / Before Design Pattern
 * -----------------------------------------
 * New Spec 1: H anabathmisi pou mas zitithike exei na kanei me tin dinatotita tis papias na petaei 
 * Solution 1: Etsi apofasizoume stin abstract klasi na baloume tin methodo fly() stin logiki ton quack() kai swim()
 *            etsi oles oi papies na exoun ayti tin dinatotita otan kanoume subclasses
 *
 * Problem 1 : Distixos me ayton ton tropo mporoun na petaxoun kai eidi papias pou den mporoun na petaxoun!!!
 * Solution2 : San 2i lisi loipon prokreinete to na  kanei OVERRIDE mesa stis CONCRETE CLASSES (diladi tis klasis ton eidon tis papias)
 *             tropoopiontas ton kodika oste aytes pou den mporoun na petoun na min petoun
 * 
 */
package SeperateVaryFromNonChangable.before.upgrade.upgrade1.try2;

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

	// 		++ New Spec Code (Starts)
	// Generaly code for a duck to swim
	public void fly(){
		System.out.println("I am flying;");
	}
	// 		++ New Spec Code (Ends)
	
	
	
	// -- Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen

	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();


	// Other duck-like methods
	
}
