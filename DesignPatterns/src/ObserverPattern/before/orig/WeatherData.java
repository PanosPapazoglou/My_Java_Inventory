package ObserverPattern.before.orig;

public class WeatherData {
	
	float temp = getTemperature();
	float humidity = getHumidity();
	float pressure = getPressure();
	
	
	// Setters (Starts)
	public void setTemperature(float temp){
		this.temp = temp;
	}
	
	public void setHumidity(float humidity){
		this.humidity = humidity;
	}
	
	public void setPressure(float pressure){
		this.pressure = pressure;
	}
	// Setters (Ends)
	
	
	
	// Getters (Starts)
	public float getTemperature(){
		return temp;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
	// Getters (Ends)
	
	
	
	
	
	
	// With this 3 methods we upgrade the displays
	currentConditionsDisplay.update(temp,humidity,pressure);
	statisticsDisplay.update(temp,humidity,pressure);
	forecastDisplay.update(temp,humidity,pressure);
	
	// Other WeatherData methods here
	
	
	
	// Our code will go here for integration..
	public void measurementsChanged(){
		// Our code goes here..
	}
	

}
