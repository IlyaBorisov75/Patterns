package Flyweight;

public class AppFlyweight {
	public void app() {
		FlyweightFactory ff = new FlyweightFactory();
		ff.getShape("����").draw(5, 5);
		ff.getShape("����").draw(10, 13);
		ff.getShape("�������").draw(10, 13);
	}
}
