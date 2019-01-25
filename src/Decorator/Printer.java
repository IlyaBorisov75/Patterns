package Decorator;

public class Printer implements Text{
	String text;
	public Printer(String text) {
		this.text = text;
	}
	
	@Override
	public void write() {
		System.out.print(text);
	}

}
