package Observer;

public class AppObserver {
	void App(){
		MeteoStation meteo =  new MeteoStation();
		Observer observer =  new ConsoleObserver();
		
		meteo.addObserver(observer);
		meteo.setMeteo(25, 748);
	}
}
