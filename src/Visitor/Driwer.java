package Visitor;

public class Driwer  implements Visitor{

	@Override
	public void visit(Body body) {
		}

	@Override
	public void visit(Motor motor) {
		System.out.println("Завожу двигатель");
	}


}
