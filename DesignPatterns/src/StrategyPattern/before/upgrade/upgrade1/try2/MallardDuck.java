package StrategyPattern.before.upgrade.upgrade1.try2;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a Mallard!");
	}
	
	
}
