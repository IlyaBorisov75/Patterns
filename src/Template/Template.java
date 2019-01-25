package Template;

public abstract class Template {
	public void write() {
		differOne();
		System.out.println("2");
		differTwo();
	}
	abstract void differOne();
	abstract void differTwo();
}
