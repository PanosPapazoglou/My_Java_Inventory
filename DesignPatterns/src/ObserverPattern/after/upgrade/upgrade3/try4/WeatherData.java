package ObserverPattern.after.upgrade.upgrade3.try4;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{

	// Instance variables Decleration
	float temperature;
	float humidity;
	float pressure;
	
	// O constructor mas den xreiazetai pia na dimiourgei mia domi (ArrayList) poy tha krata tous Observers..i superklasi tha to kanei ayto apo edo kai pera..
	public WeatherData(){
		// Empty Constructor..
	}
	

	// Our code will go here for integration..
	//This method gets called whenever the weather measurements have been updated and now it callse the notifyObservers() method
	public void measurementsChanged(){
		// Kaloume tin setChanged() method gia na episimanoume oti i katastasi ontos allaxe prin kalesoume tin notifyObservers().
		setChanged();
		
		// Stin parakato methodo den stelnoume data Object me tin klisi mas!! Ayto simainei oti xrisimopoioume Pull method..
		// Diladi o Observer apla enimeronete oti egine kapoia allagi kai as elthei na parei oti neo dato thelei..
		notifyObservers();
	}
		
	
	// Ftiaxnoume ayti tin methodo oste na mporoume apo tin main...na tropopoiopume tis times..oste na doume an douleuei to Observer Pattern
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	
	
	
	// Oi 3 methodoi pou eprepe na ilopoiithoun apo to Subject Interface pou eixame ftiaxei alla kai to idio to Subject Interface pleon den xreiazontai..(opos kai to Observer..)
	// (Den xreiazontai oi methodoi.. :  registerObserver(Observer o), removeObserver(Observer o), notifyObservers()
	// Akolouthoun oi 3 methodoi pou prepei na ylopoiithoun epeidi i klasi mas kanei implement to Subject Interface
	// When the observer registers, we just add it to the end of the list

	
	//Telos oi getters ton Instance Variables mas..pou exoume orisei parapano..
	public float getTemperature(){
		return temperature;
	}

	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}	


}
