package Decorator;

public class RightBracetDecorator extends Decorator{

	public RightBracetDecorator(Text component) {
		super(component);
	}

	public void write() {
		component.write();
		System.out.print(")");
		
	}

}
