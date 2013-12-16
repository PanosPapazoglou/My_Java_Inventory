package ObserverPattern.after.upgrade.upgrade1.try2;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData){
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
		
		// kai epikaloumaste tin display() method
		display();
	}
	
	@Override
	public void display(){
		System.out.println("Statistics: "+ temperature + "F degrees and " + humidity+"% humidity");
	}

}
