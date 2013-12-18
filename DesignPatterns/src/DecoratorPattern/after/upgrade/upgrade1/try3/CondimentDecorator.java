package DecoratorPattern.after.upgrade.upgrade1.try3;

// Ftiaxnoume to compoent/decorator/wrapper ylopoiontas to meso tisabstract class ton Condiments..ton wrapper diladi 
// Katarxas tha prepei na eimaste interchangeable me ton Beverage kai gi' ayto epektinoume tin Beverage class (na exoume ton idio tipo..)
public abstract class CondimentDecorator extends Beverage{

	// Me tin parakato grammi ipoxreonoume olous tou Condinent Decorators(Wrappers) oste na ulopoiisoun tin getDescription() method
	// Ayto to kanoume ypoxreotiko (kathos tha mporousan apla na kanoun override oste na min xexasoun kai na anaferoun 
	// ,kanontas enchanged tin methodo...getDescription, kai tin perigrafi tou extra ylikou (condident)
	public abstract String getDescription();
	
}