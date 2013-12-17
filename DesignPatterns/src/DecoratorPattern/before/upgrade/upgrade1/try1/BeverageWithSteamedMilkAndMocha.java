package DecoratorPattern.before.upgrade.upgrade1.try1;

public abstract class BeverageWithSteamedMilkAndMocha extends Beverage {

	public BeverageWithSteamedMilkAndMocha(){
		description = "This is Beverage with steamed milk and Mocha!!";
	}
	
	public double cost(){
		return 0;
	};
	
}
