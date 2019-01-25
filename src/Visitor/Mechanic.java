package Visitor;

public class Mechanic implements Visitor{

	@Override
	public void visit(Body body) {
		System.out.println("Чиню корпус");
	}

	@Override
	public void visit(Motor motor) {
		System.out.println("Чиню двигатель");
	}

}
