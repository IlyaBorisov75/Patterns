package Command;

public class AppCommand {
	void App() {
		Computer comp = new Computer();
		User u = new User(new OnCommand(comp), new OfCommand(comp), new ResetCommand(comp));
		
		u.onComputer();
		u.ofComputer();
		u.resetComputer();
	}
}
