package AbstractFactory;

public class WictorianFactory implements Factory{

	public Chair createChair() {
		return new WictorianChair();
	}
	public Table createTable() {
		return new WictorianTable();
	}
	public Sofa createSofa() {
		return new WictorianSofa();
	}
}
