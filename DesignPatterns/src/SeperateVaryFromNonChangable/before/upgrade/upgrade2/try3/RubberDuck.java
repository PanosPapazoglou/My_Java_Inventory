package SeperateVaryFromNonChangable.before.upgrade.upgrade2.try3;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a RubberDuck!");
	}

	// 		++ New Spec Code - Solution 2 (Starts)
	@Override
	public void fly(){
		// Override to do nothing
	}
	// 		++ New Spec Code - Solution 2 (Ends)
	
}
