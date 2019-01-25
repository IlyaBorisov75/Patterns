package Visitor;

public class AppVisitor {
	Element motor = new Motor();
	Element body = new Body();
	Visitor mech = new Mechanic();
	Visitor driwer = new Driwer();
	
	public void app() {
		motor.acept(mech);
		body.acept(mech);
		motor.acept(driwer);
	}
}
