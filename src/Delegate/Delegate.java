package Delegate;

public class Delegate {
	Worker worker;
	
	public Delegate SetWorker(Worker w) {
		worker = w;
		return this;
	}
	
	public void work() {
		worker.work();
	}
}
