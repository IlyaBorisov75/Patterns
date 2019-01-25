package Decorator;

public abstract class Decorator implements Text{
	Text component;
	
	public Decorator (Text component) {
		this.component = component;
	}
}
