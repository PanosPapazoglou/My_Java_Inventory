package StrategyPattern.before.upgrade.upgrade2.try3;

public class MallardDuck extends Duck implements Flyable,Quackable {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	// Must override because of abstract method of the abstract class
	@Override
	public void display() {
		System.out.println("Looks like a Mallard!");
	}

	// Edo tha prepei ypoxreotika na Ylopoiisoume tin methodo fly() tou Interface Flyable poy kanoume implement os (MallarDuck class)
  // Must override because all interfaces methods are abstract and need to be implemented!!
	@Override
	public void fly() {
		// TODO fly method for MallardDuck
	}
	
	// Edo tha prepei ypoxreotika na Ylopoiisoume tin methodo quack() tou Interface Quackable poy kanoume implement os (MallarDuck class)
	// Must override because all interfaces methods are abstract and need to be implemented!!
	@Override
	public void quack() {
		// TODO quack method for MallardDuck
	}

	
}
