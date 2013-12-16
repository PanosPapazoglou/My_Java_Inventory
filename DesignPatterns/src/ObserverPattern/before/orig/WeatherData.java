package ObserverPattern.before.orig;

public class WeatherData {
	
	float temp = getTemperature();
	float humidity = getHumidity();
	float pressure = getPressure();
	

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
		// Our code goes here..
	}
	

}
