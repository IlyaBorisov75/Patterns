import Command.Computer;
import Command.OfCommand;
import Command.OnCommand;
import Command.ResetCommand;
import Command.User;
import Decorator.LeftBracetDecorator;
import Decorator.Printer;
import Decorator.RightBracetDecorator;
import Decorator.Text;
import Facade.Facade;
import Interpreter.AppInterpreter;
import Template.AppTemlate;
import Template.Template;
import Visitor.AppVisitor;

public class FuleTest {

	public static void main(String[] args) {
		AppInterpreter app = new AppInterpreter();
		app.app();
	}

}
