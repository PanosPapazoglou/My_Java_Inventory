package StrategyPattern.before.upgrade.upgrade2.try3;

public abstract class Duck {
	
	public Duck(){
		// TODO Auto-generated constructor stub		
	}

	// -- All Ducks Swim - Thats why we put the code here in the abstract class

  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}

	// -- Afairoume tis methodous fly() kai quack() apo tin superclass afou paratiroume oti
	//    eite kapoia eidi den petane i den kanoun quack
	//    eite to kanoun alla me diaforetiko tropo
	//    Etsi den eimaste se thesi na grapsoume ena genikeymeno kodika meso aytis tis superclass

	
	// -- Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen

	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();


	// Other duck-like methods
	
}
