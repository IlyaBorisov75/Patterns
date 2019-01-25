package Factory;

public class Factory {
	
	public void ShowFactory() {
		ChairMaker maker = getMakerByName("Classic");
		
		Chair chair = maker.createchair();
		
		chair.era();
		
	}
	

	private ChairMaker getMakerByName(String name) {
		switch(name){
			case "Classic":
				return new ClassicChairMaker();
			case "Wictorian":
				return new WictorianChairMaker();				
		}
		
		throw new RuntimeException("Unsuppored nam: " + name);
	}
}
