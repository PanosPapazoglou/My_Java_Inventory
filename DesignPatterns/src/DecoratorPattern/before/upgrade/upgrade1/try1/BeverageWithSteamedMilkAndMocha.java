package DecoratorPattern.before.upgrade.upgrade1.try1;

public abstract class BeverageWithSteamedMilkAndMocha extends Beverage {

	private String description;
	
	public String getDescription(){
		return description;
	}
	
	public abstract float cost();

	// Other Usefull methods!!
	
}
