package Decorator;

public class LeftBracetDecorator extends Decorator{

	public LeftBracetDecorator(Text component) {
		super(component);
	}
	public void write() {
		System.out.print("(");
		component.write();
	}

}
