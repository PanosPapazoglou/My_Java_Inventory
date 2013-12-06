package SeperateVaryFromNonChangable.before;

public abstract class Duck {
	
	// The constructor of a Duck
	public Duck(){
		
	}
	
	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();
  
  
  // Generaly code for a duck to quack
	public void quack(){
		System.out.println("I am quaking!");
	}

  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}
	

	// Other duck-like methods
	
}
