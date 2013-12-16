package ObserverPattern.before.upgrade.upgrade1.try1;

public class WeatherData {

	// Instance variables Decleration
	float temp;
	float humidity;
	float pressure;
	
	// Our code will go here for integration..
	//This method gets called whenever the weather measurements have been updated
	public void measurementsChanged(){
		
		temp = getTemperature();
		humidity = getHumidity();
		pressure = getPressure();
		
		// With this 3 methods we upgrade the displays
		currentConditionsDisplay.update(temp,humidity,pressure);
		statisticsDisplay.update(temp,humidity,pressure);
		forecastDisplay.update(temp,humidity,pressure);
		
	}
	

}
