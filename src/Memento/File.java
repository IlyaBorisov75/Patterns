package Memento;

import java.util.ArrayList;
import java.util.List;

public class File {
	List<Saves> saves = new ArrayList<>();

	public Saves getSave(int index) {
		return saves.get(index);
	}

	public void setSave(int index, Saves save)  {
		this.saves.add(index, save);
	}
}
