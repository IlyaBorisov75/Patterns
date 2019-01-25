package Command;

public class OnCommand extends CompCommand implements Command{
	public OnCommand(Computer comp) {
		super(comp);
	}

	@Override
	public void execute() {
		comp.on();
	}

}
