package Composite;

public class ApplicationComposite {
	Composite comp = new Composite();
	Composite comp1 = new Composite();
	Composite comp2 = new Composite();
	
	Shapes triangle1 = new Triangle();
	Shapes triangle2 = new Triangle();
	
	Shapes square1 = new Square();
	Shapes square2 = new Square();
	
	void app() {
		comp1.addComponent(triangle1);	
		comp1.addComponent(triangle2);
		
		comp2.addComponent(square1);	
		comp2.addComponent(square2);	
		
		comp.addComponent(comp1);
		comp.addComponent(comp2);
		
		comp.draw();
	}
	
	
}
