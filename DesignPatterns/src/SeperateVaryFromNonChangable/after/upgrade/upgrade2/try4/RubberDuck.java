package SeperateVaryFromNonChangable.after.upgrade.upgrade2.try4;

public class RubberDuck extends Duck {

	public RubberDuck() {
		FlyBehavior     flybehavior = new FlyNoWay();
		QuackBehavior quackbehavior = new Squeak();
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a RubberDuck!");
	}
	
	// -4- Diagrafoume tin methodo quack() pou ipirxe
	
}
