package SeperateVaryFromNonChangable.before.upgrade.upgrade1.try1;

public abstract class Duck {
	
	public Duck(){
		// TODO Auto-generated constructor stub		
	}

	// -- All Ducks quacks and Swim ++AND FLY++ - Thats why we put the code here in the abstract class
  // Generaly code for a duck to quack
	public void quack(){
		System.out.println("I am q!");
	}

  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}

	// 		++ New Spec Code (Starts)
	// Generaly code for a Duck to Swim
	public void fly(){
		System.out.println("I am flying;");
	}
	// 		++ New Spec Code (Ends)
	
	
	
	// -- Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen

	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();


	// Other duck-like methods
	
}
