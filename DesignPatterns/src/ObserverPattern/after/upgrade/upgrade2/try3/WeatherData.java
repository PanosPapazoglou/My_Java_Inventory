package ObserverPattern.after.upgrade.upgrade2.try3;

import java.util.ArrayList;

public class WeatherData implements Subject{

	// Instance variables Decleration
	private ArrayList observers;
	float temperature;
	float humidity;
	float pressure;
	
	// Ston constructor kanoume initialize tous observers Arraylist..
	public WeatherData(){
		observers = new ArrayList();
	}
	
	
	// Akolouthoun oi 3 methodoi pou prepei na ylopoiithoun epeidi i klasi mas kanei implement to Subject Interface
	// When the observer registers, we just add it to the end of the list
	public void registerObserver(Observer o){
		observers.add(o);
	}
	

	// Likewise, when an observer wants to un-register, we just take it off the list
	public void removeObserver(Observer o){
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	
	// Here is the fun part..this is where we tell all the observers about the state
	// Because they are all Observers, we know they all implement update(), so we know how to notify them!!!
	public void notifyObservers(){
		for(int i=0; i<observers.size(); i++){
			Observer  observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
			
		}
	}
	
	// Our code will go here for integration..
	//This method gets called whenever the weather measurements have been updated and now it callse the notifyObservers() method
	public void measurementsChanged(){
		notifyObservers();
	}
	
	// Ftiaxnoume ayti tin methodo oste na mporoume apo tin main...na tropopoiopume tis times..oste na doume an douleuei to Observer Pattern
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
