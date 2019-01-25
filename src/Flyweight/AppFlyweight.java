package Flyweight;

public class AppFlyweight {
	public void app() {
		FlyweightFactory ff = new FlyweightFactory();
		ff.getShape("Круг").draw(5, 5);
		ff.getShape("Круг").draw(10, 13);
		ff.getShape("Квадрат").draw(10, 13);
	}
}
