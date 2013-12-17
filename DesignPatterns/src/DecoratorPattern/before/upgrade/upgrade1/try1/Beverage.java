package DecoratorPattern.before.upgrade.upgrade1.try1;

public abstract class Beverage {

	private String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	
	public String getDescription(){
		return description;
	}
	
	
	public abstract float cost();

	// Other Usefull methods!!
	
}
