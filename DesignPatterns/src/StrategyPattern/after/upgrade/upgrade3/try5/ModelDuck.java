package StrategyPattern.after.upgrade.upgrade3.try5;

public class ModelDuck extends Duck{

	//PROSOXH!!! O constructor den thelei void ktl..
	// p.x. ayto den tha epeze an kaname new..
	//	public void ModelDuck(){
	// MONO TO ..
	// public ModelDuck()
	public ModelDuck(){
		// We initialize the flybehavior instance variable with an instance of thype FlyWithWings ( a FlyBehavior concrete implementation class)
		flybehavior = new FlyNoWay();
		quackbehavior = new Quack();
	}
	
	public void display(){
		System.out.println("I am a model duck!!");
	}

}
