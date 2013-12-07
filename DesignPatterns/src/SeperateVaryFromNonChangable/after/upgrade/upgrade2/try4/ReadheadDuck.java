package SeperateVaryFromNonChangable.after.upgrade.upgrade2.try4;

public class ReadheadDuck extends Duck{

	// We initialize the flybehavior instance variable with an instance of thype FlyWithWings ( a FlyBehavior concrete implementation class)
	public ReadheadDuck() {
		FlyBehavior     flybehavior = new FlyWithWings();
		QuackBehavior quackbehavior = new Quack();
	}
	
	public void display(){
		System.out.println("Looks like a ReadheadDuck!");
	}
	
	
	// -4- Diagrafoume tis methodous fly() kai quack() pou ipirxan	

}
