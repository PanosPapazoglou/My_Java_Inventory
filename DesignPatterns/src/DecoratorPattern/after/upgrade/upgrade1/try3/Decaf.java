package DecoratorPattern.after.upgrade.upgrade1.try3;

public class Decaf extends Beverage{
	
	// Ston constructor orizoume to description tou Decaf
	public Decaf(){
		description = "Decaf";
	}
	
	// Epipleon orizoume to kostos tou Decaf (sketou xoris extra ulika)
	public double cost(){
		return 1.05;
	}
	
}