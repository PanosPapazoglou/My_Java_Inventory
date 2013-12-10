package StrategyPattern.after.upgrade.upgrade2.try4;

public class MallardDuck extends Duck {

	// +4+ Orizoume mesa ston constructor tous tis flyBehavior kai quackBehavior instance variables 
	//       kanontas instanciate me tin katallili class pou ilopoiei to Behavior Interface
	// We initialize the flybehavior instance variable with an instance of thype FlyWithWings ( a FlyBehavior concrete implementation class)
	public MallardDuck() {
		// Bebaia...na simeiosoume edo oti ypopeftoume se ena lathos...me ayto pou kanoume 
		// se sxesi me to Design Principle : Code an Interface NOT an Implementation
		// kai emeis edo kanoume hardcoded...new tin sigkekrimeni klasi..
		// Parolo pou sinexizoume na exoume mia morfi eleytherias afou mporoume kai kata to runtime na allaxoume ton tropo tou FlyWithWings
		// den tha mporousame omos na poume oti..p.x. to antikeino MallardDuck1 eixe ena atixima..kai tora den mporei na petaxei..kata to runtime..
		// Alla ayto tha to diorthosoume sto epomeno Software Development Iteration mas..
		// otan tha doume nea Design Principles p.x. sto try5..
		
		// PROSOXH!! AN TO DHLODO ETSI DEN PAIZEI!!! 
		// QuackBehavior quackbehavior = new Quack(); dioti mallon theti tin 		quackbehavior os localvar
		// kai oxi os var pou exei oristei apo to Interface tis!!!
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
		
		
		
	}
	
	public void display(){
		System.out.println("Looks like a Mallard!");
	}
	
	// -4- Diagrafoume tis methodous fly() kai quack() pou ipirxan

}
