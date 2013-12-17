package DecoratorPattern.before.upgrade.upgrade1.try2;

public abstract class Beverage {

	public String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;

	public String getDescription(){
		return description;
	}
	
	// Ylopoioume stin abstract class tin methodo cost os pros to kostos pou exoun ta condiments
	// kai tha afisoume stis concrete classes pou tha kanoun extend to Beverage na ipologizoun to sinoliko kostos
	// basismenes sto condiments_cost pou orisame stin abstract class + to kostos tou ekastote beverage
	// pou exoume epilexei kai ilopoieite apo tin conrete class..
	public double cost(){
		float beverage_cost   = 0;
		float condiments_cost = 0;
		float total_cost = beverage_cost + condiments_cost; 
		return total_cost;
	};
	
	
	

	
	// Getters & Setters (Starts)
	
	public boolean hasMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean hasMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean hasWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}
	
	// Getters & Setters (Ends)
	
	
	// Other Usefull methods!!
	
}
