package Visitor;

public class Body implements Element{

	@Override
	public void acept(Visitor visitor) {
		visitor.visit(this);
	}

}
