package ChainOfResponsibility;

public class FileLogger extends Logger {

	public FileLogger(int priority) {
		super(priority);
	}

	@Override
	void write(String massage) {
		System.out.println("Mail:" + massage);
	}

}
