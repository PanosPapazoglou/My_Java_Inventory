package StrategyPattern.before.upgrade.upgrade1.try2;

public class ReadheadDuck extends Duck {

	public ReadheadDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a ReadheadDuck!");
	}
	
	
}
