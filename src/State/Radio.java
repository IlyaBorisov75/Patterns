package State;

//Context
public class Radio {
	Station station;

	public void setStation(Station station) {
		this.station = station;
	}
	public void nextStation() {
		if (station instanceof RadioOne) {
			setStation(new RadioTwo());
		}else {
			setStation(new RadioOne());
		}
	}
	public void play() {
		station.play();
	}
}
