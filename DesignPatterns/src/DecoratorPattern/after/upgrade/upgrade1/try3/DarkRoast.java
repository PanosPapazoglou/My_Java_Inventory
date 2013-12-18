package DecoratorPattern.after.upgrade.upgrade1.try3;

public class DarkRoast extends Beverage{
	
	// Ston constructor tou DarkRoast orizoume kai to description tou
	public DarkRoast(){
		description = "DarkRoast Coffee";
	}
	
	// Epipleon orizoume to kostos tou DarkRoast (sketou..xoris extra ulika)
	public double cost(){
		return .99;
	}
	
}