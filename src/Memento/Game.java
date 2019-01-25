package Memento;



import java.util.Date;

public class Game {
	private String lvl;
	private Date time;
	public void setLvl(String lvl) {
		this.lvl = lvl;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Game [lvl=" + lvl + ", time=" + time + "]";
	}
	void showStats() {
		System.out.println(this.toString());
	}
	public Saves save() {
		return new Saves(lvl, time);
	}
	public void load(Saves save) {
		lvl = save.getLvl();
		time = save.getTime();
	}
}
