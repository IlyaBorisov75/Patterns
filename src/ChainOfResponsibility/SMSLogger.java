package ChainOfResponsibility;

public class SMSLogger extends Logger {

	public SMSLogger(int priority) {
		super(priority);
	}

	@Override
	void write(String massage) {
		System.out.println("SMS:" + massage);
	}

}
