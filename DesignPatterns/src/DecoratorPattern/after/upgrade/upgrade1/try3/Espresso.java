package DecoratorPattern.after.upgrade.upgrade1.try3;

// Katarxas kanoume extend ton Espreso afou epi tis ousias einai ena Beverage (klasiki klironomikotita..)
public class Espresso extends Beverage{
	
	// Ston constructor tou concrete HouseBlend orizoume to description tou..
	public Espresso(){
		// To description Instance Variable klironomeite apo tin abstract class Beverage pou epektiname edo stin concrete Espresso class.. 
		description = "Espresso";
	}
	
	// To kostos tou Espresso (sketou..xoris extra ilika..)
	// Den prepei na mas apasxolei to kostos ton opoion extra ilikon..se ayto to simeio me aytio tin ilopoisi (me to Decorator Pattern diladi..kai ayto einai to kalo tou pattern..)
	public double cost(){
		return 1.99;
	}
	
}