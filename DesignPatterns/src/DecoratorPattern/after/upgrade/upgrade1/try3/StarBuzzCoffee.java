package DecoratorPattern.after.upgrade.upgrade1.try3;

public class StarBuzzCoffee{
	
	public static void main(String[] args){
		//Order up an espresso and print out its description and cost..
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		// Make a DarkRoast Beverage..object
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); // Wrap it with Mocha
		beverage2 = new Mocha(beverage2); // Wrap it with a second Mocha
		beverage2 = new Whip(beverage2);	// Wrap it with a Whip
		System.out.println(beverage2.getDescription() +" $"+beverage2.cost());
		
		//Finally give us a Houseblend with Soy,Mocha, and Whip
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() +" $"+beverage3.cost());
	}
	
}