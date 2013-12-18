package DecoratorPattern.after.upgrade.upgrade1.try3;

// Mocha is a decorator so we extend CondimentDecorator
// and CondimentDecorator extends Beverage
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	// We are going to instantiate Mocha with a reference to a Beverage using :
	// (1) An instance variable to hold the beverage we are wrapping
	// (2) A way to set this instance variable to the object we are wrapping.
	//     Here, we are going to pass the beverage we' re wrapping to the decorator's constructor
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	// We want our description to not only include the beverage - say "Dark Roast" - but also to include each item decoration
	//    the beverage, for instance, "Dark Roast, Mocha".
	// So we first delefate to the object we are decorationg to get its description, then append", Mocha" to that description
	public String getDescription(){
		return beverage.getDescription() + ", Mocha";
	}
	
	
	// Finaly we need to compute the cost of our veberage with Mocha.
	// First we delegate(anathetoume/aposteloume..) the call to the object we're decoreting, so that it can compute the cost,
	//       then we add the cost of Mocha to the result.
	public double cost(){
		return 0.20 + beverage.cost();
	}
	
	
}