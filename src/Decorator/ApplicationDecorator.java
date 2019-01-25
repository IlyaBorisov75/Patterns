package Decorator;

public class ApplicationDecorator {
	void app() {
		Text text = new Printer("x+x");
		text = new LeftBracetDecorator(text);
		text = new RightBracetDecorator(text);
		
		text.write();
	}
}
