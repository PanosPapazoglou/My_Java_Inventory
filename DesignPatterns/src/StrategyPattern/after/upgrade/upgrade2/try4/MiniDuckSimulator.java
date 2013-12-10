package StrategyPattern.after.upgrade.upgrade2.try4;

public class MiniDuckSimulator {

	// Ftiacnoume ayti tin test class oste na dokimasoume ton kodika mas
	// kai stin main tou dimiourgoume mia papia tipou Mallard 
	// kai tin bazoume na ektelesi Quack kai Fly
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

}
