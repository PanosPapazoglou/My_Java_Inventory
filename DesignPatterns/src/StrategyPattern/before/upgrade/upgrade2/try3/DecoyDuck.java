package StrategyPattern.before.upgrade.upgrade2.try3;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a DecoyDuckk!");
	}  

}
