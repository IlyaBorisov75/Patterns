package Command;

public class User {
	Command on;
	Command of;
	Command reset;
	public User(Command on, Command of, Command reset) {
		this.on = on;
		this.of = of;
		this.reset = reset;
	}
	public void onComputer() {
		on.execute();
	}
	public void ofComputer() {
		of.execute();
	}
	public void resetComputer() {
		reset.execute();
	}
}
