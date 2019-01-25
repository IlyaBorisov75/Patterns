package AbstractFactory;

public class ClassicChair implements Chair{

	public int SetComfort() {
		return 5;
	}
	public int SetBeauty() {
		return 3;
	}

	public void era() {
		System.out.println("Современный стул. Комфорт " + SetComfort() + "Красота " +SetBeauty());
	}

}

