package ObserverPattern.after.upgrade.upgrade2.try3;

public interface Subject {

	// Gia na mporei na kanei register kathe observer (eggrafi gia enimeroseis..)   
	public void registerObserver(Observer o);
	
	// Gia na mporei na kanei unregister kathe observer (apeggrafi apo tis enimeroseis..)
	public void removeObserver(Observer o);
	
	//Ayti i methodos kaleite oste na enimerosi olous tous observers oti to Subject State allaxe.. 
	public void notifyObservers();
	
}
