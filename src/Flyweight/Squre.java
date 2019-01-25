package Flyweight;

public class Squre implements Shape {
	int a = 5;
	@Override
	public void draw(int x, int y) {
		System.out.println("Рисуем квадрат со стороной" + a +", с центром в точке" + x + ";" + y);
	}
}
