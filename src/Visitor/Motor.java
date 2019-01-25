package Visitor;

public class Motor implements Element{

	@Override
	public void acept(Visitor visitor) {
		visitor.visit(this);
	}
}
