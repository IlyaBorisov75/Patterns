package Interpreter;

public class AppInterpreter {
	public void app() {
		Context con =  new Context();
		Expression exp = con.evaluate("100+69-30");
		System.out.println(exp.interpret());
	}
}
