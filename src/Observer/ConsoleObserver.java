package Observer;

public class ConsoleObserver implements Observer{

	@Override
	public void handleEvents(int temp, int presser) {
		System.out.println(" �����������: " +temp + " ��������:" + presser);
	}

}
