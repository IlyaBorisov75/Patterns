package Factory;

public class WictorianChair implements Chair{

	public void era() {
		System.out.println("Викторианский стул. Комфорт " + SetComfort() + "Красота " +SetBeauty());
	}
	public int SetComfort() {
		return 3;
	}
	public int SetBeauty() {
		return 5;
	}

}
