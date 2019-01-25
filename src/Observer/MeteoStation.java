package Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{
	int temperature;
	int pressure;
	
	List<Observer> observers = new ArrayList<>();
	
	public void setMeteo(int temp, int press) {
		this.temperature = temp;
		this.pressure = press;
		notifyObserver();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer o: observers)
		o.handleEvents(temperature, pressure);
	}

}
