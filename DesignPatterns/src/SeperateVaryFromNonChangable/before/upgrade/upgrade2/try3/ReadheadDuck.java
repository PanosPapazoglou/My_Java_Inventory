package SeperateVaryFromNonChangable.before.upgrade.upgrade2.try3;

public class ReadheadDuck extends Duck implements Flyable,Quackable{

	public ReadheadDuck() {
		// TODO Auto-generated constructor stub
	}

	// Overriding display method in the concrete MallardDuck in order to be more specific
	@Override
	public void display() {
		System.out.println("Looks like a ReadheadDuck!");
	}
	
  // Edo tha prepei ypoxreotika na Ylopoiisoume tin methodo fly() tou Interdace Fltyable poy kanoume implement os (MallarDuck class)
	@Override
	public void fly() {
		// TODO fly method for ReadheadDuck
	}

  // Edo tha prepei ypoxreotika na Ylopoiisoume tin methodo quack() tou Interface Quackable poy kanoume implement os (MallarDuck class)
	@Override
	public void quack() {
		// TODO quack method for ReadheadDuck
	}
	
}
