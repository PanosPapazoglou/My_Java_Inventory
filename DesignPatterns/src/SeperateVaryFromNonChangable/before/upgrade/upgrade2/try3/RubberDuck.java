package SeperateVaryFromNonChangable.before.upgrade.upgrade2.try3;

public class RubberDuck extends Duck implements Quackable {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a RubberDuck!");
	}

	// 		++ New Spec   Code - Solution 2
	//    -- New Spec 2 Code - Solution 3  (afairoume tin methdo fly pou apla tropopoiousame to kodika oste na min kanei tipota) 

	@Override
	public void quack() {
		// TODO quack Method for RubberDuck
	}
	
	
	
	
}
