package AbstractFactory;

public class ClassicFactory implements Factory{

	public Chair createChair() {
		return new ClassicChair();
	}
	public Table createTable() {
		return new ClassicTable();
	}
	public Sofa createSofa() {
		return new ClassicSofa();
	}

}
