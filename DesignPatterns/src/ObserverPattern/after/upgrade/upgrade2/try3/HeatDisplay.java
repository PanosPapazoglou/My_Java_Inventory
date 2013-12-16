package ObserverPattern.after.upgrade.upgrade2.try3;

public class HeatDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float heat;
	private Subject weatherData;
	
	public HeatDisplay(Subject weatherData){
		// Epi tis ousias se ayton ton constructor leme oti otan ginei instantiate ayto to Display...dose mazi kai to Subject object
		this.weatherData = weatherData;

		// oste na mporesoume na kanoume register to CurrentConditionsDisplay Instance mas ston Observer kai na mpei stin Observer ArrayList
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// Otan kaleite apo to Subject i update autis tis concrete display klassis..
		// pernoume ta nea data..
		this.temperature = temperature;
		this.humidity = humidity;
		this.heat = computeHeatIndex(temperature, humidity);
		// kai epikaloumaste tin display() method
		display();
	}
	
	@Override
	public void display(){
		System.out.println("Heat index is "+ heat);
	}

	
	private float computeHeatIndex(float t, float rh) {
    float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
        (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
        (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
        (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
        (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
        (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
        0.000000000843296 * (t * t * rh * rh * rh)) -
        (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    return index;
	}
	
}
