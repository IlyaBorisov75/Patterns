package Bridge;

public class Hatchback extends Car {

	public Hatchback(Make make) {
		super(make);
	}
	@Override
	void showType() {
		System.out.println("Hatchback");
	}

}
