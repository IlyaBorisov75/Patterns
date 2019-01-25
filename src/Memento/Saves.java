package Memento;

import java.util.Date;

public class Saves {
	private final String lvl;
	private final Date time;
	
	public Saves(String lvl, Date time) {
		this.lvl = lvl;
		this.time = time;
	}

	public String getLvl() {
		return lvl;
	}

	public Date getTime() {
		return time;
	}
}
