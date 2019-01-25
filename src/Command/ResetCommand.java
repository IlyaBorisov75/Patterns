package Command;

public class ResetCommand extends CompCommand implements Command{

	public ResetCommand(Computer comp) {
		super(comp);
	}

	@Override
	public void execute() {
		comp.reset();
	}

}
