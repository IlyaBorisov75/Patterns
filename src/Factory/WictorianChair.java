package Factory;

public class WictorianChair implements Chair{

	public void era() {
		System.out.println("������������� ����. ������� " + SetComfort() + "������� " +SetBeauty());
	}
	public int SetComfort() {
		return 3;
	}
	public int SetBeauty() {
		return 5;
	}

}
