package ChainOfResponsibility;

public class MailLogger extends Logger {

	public MailLogger(int priority) {
		super(priority);
	}

	@Override
	void write(String massage) {
		System.out.println("SMS:" + massage);
	}

}
