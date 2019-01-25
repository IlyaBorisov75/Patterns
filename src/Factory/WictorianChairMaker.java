
package Factory;

public class WictorianChairMaker implements ChairMaker{

	public Chair createchair() {
		return new WictorianChair();
	}

}
