package Bridge;

public class Sedan extends Car {

	public Sedan(Make make) {
		super(make);
	}
	@Override
	void showType() {
		System.out.println("Sedan");
	}

}
