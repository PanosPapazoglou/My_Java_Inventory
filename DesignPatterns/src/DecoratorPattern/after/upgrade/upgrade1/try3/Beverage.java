package DecoratorPattern.after.upgrade.upgrade1.try3;

// H Beverage einai mia abstract class me 2 methodous..
// tin getDescription
// kai tin abstract cost()
public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
