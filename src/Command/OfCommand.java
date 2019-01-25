package Command;

public class OfCommand extends CompCommand implements Command{
	public OfCommand(Computer comp) {
		super(comp);
	}
	@Override
	public void execute() {
		comp.off();
	}

}
