package StrategyPattern.before.upgrade.upgrade1.try1;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a RubberDuck!");
	}
	
}
