package ObserverPattern.after.upgrade.upgrade1.try2;

public class WeatherData {

	// Instance variables Decleration
	float temp;
	float humidity;
	float pressure;
	
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
