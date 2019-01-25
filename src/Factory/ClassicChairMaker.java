package Factory;

public class ClassicChairMaker implements ChairMaker{

	public Chair createchair() {
		return new ClassicChair();
	}

}
