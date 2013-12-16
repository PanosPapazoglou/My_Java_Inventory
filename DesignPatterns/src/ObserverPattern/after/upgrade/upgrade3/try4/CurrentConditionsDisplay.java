package ObserverPattern.after.upgrade.upgrade3.try4;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable; //++
	private float temperature;
	private float humidity;

	
	public CurrentConditionsDisplay(Observable observable){
		// Epi tis ousias se ayton ton constructor leme oti otan ginei instantiate ayto to Display...dose mazi kai to Observable object
		this.observable = observable;

		// oste na mporesoume na kanoume register to CurrentConditionsDisplay Instance mas ston Observer
		observable.addObserver(this);
	}
	
	
	@Override
	public void update(Observable obs, Object arg) {

		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			// pernoume ta nea data..
			this.temperature = weatherData.getTemperature();
			this.humidity    = weatherData.getHumidity();
			
			// kai epikaloumaste tin display() method
			display();			
		}
		
	}
	
	
	@Override
	public void display(){
		System.out.println("Current conditions: "+ temperature + "F degrees and " + humidity+"% humidity");
	}

}
