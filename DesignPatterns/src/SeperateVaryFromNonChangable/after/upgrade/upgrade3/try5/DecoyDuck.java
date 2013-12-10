package SeperateVaryFromNonChangable.after.upgrade.upgrade3.try5;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		FlyBehavior     flybehavior = new FlyNoWay();
		QuackBehavior quackbehavior = new MuteQuack();
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a DecoyDuckk!");
	}  


	
}
