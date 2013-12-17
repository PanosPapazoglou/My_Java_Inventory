package DecoratorPattern.before.upgrade.upgrade1.try1;

public abstract class Beverage {

	public String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

	// Other Usefull methods!!
	
}
