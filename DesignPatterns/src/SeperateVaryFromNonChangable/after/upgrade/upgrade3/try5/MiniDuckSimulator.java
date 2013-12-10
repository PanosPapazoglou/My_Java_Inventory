package SeperateVaryFromNonChangable.after.upgrade.upgrade3.try5;

public class MiniDuckSimulator {

	// Ftiacnoume ayti tin test class oste na dokimasoume ton kodika mas
	// kai stin main tou dimiourgoume mia papia tipou Mallard 
	// kai tin bazoume na ektelesi Quack kai Fly
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		
		
		Duck modelDuck = new ModelDuck();
		
		// Edo to performFly epafiete sto flyBehavior object poy oristike ston constructor tou ModelDuck kata to initialize (new)
		// kai einai FlyNoWay..
		modelDuck.performFly();
		
		// Edo thetoume mia nea flyBehavior dinontas stin methodo ena neo antikeimeno tipou flyBehavior pouy kanoume instantiate onthefly
		// to..FlyRocketPowered
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		
		// Telos zitontas pali sto modelDuck na kanei performFly...
		// ayti tin fora tha grapsei "I am flying with a rocket" akribos epeidi allaxame stin proigoumeni grammi se runtime
		// to behavior tou modelDuck prosdidontas tou meso tis setFlyBehavior.
		modelDuck.performFly();
		
	}

}
