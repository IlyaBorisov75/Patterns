package AbstractFactory;

public class AbstractFactory {
	
	public void ShowAbstractFactory() {
		Factory factory = getFactoryByName("Classic");
		
		Chair chair = factory.createChair();
		Table table = factory.createTable();
		Sofa sofa = factory.createSofa();
		
		chair.era();
		table.era();
		sofa.era();
	}
	

	private Factory getFactoryByName(String name) {
		switch(name){
			case "Classic":
				return new ClassicFactory();
			case "Wictorian":
				return new WictorianFactory();				
		}
		
		throw new RuntimeException("Unsuppored nam: " + name);
	}
}
