package DecoratorPattern.after.upgrade.upgrade1.try3;

public class HouseBlend extends Beverage{
	
	// Ston constructor tou concrete HouseBlend orizoume to description tou..
	public HouseBlend(){
		description = "House Blend Coffee";
	}
	
	// Epipleon orizoume to kostos tou HouseBlend (sketou..xoris extra ilika)
	public double cost(){
		return .89;
	}
	
}