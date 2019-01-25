package ChainOfResponsibility;

public abstract class Logger {
	Logger next;
	int priority;
	
	public Logger(int priority) {
		this.priority = priority;
	}

	public void setNext(Logger next) {
		this.next = next;
	}
	
	public void setMassage(String massage, int level) {
		if(level<=priority) {
			write(massage);
		}
		if(next!=null) {
			next.write(massage);
		}
	}
	
	abstract void write(String massage);
}
