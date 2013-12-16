package ObserverPattern.before.orig;

public class WeatherData {
	
	float temp = getTemperature();
	float humidity = getHumidity();
	float pressure = getPressure();
	
	// Our code will go here for integration..
	//This method gets called whenever the weather measurements have been updated
	public void measurementsChanged(){
		// Our code goes here..
	}
	

}
