package Memento;

import java.util.Date;

public class AppMemento {
	
	void App() {
		Game game = new Game();
		game.setLvl("Level 1"); 
		game.setTime(new Date());
		
		File file = new File();
		file.setSave(1, game.save());
		
		game.setLvl("Level 2"); 
		game.setTime(new Date());
		
		game.load(file.getSave(1));
	}
}
