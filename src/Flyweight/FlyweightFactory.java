package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	Map<String, Shape> shapes = new HashMap<>();

	public Shape getShape(String shapeName) {
		Shape shape = shapes.get(shapeName);
		if (shapes == null) {
			switch(shapeName) {
				case "Круг":
					shape = new Circle();
					break;
				case "Квадрат":
					shape = new Circle();
					break;
				case "Точка":
					shape = new Circle();
					break;
				default:
					throw new RuntimeException("такого нет");
			}
		shapes.put(shapeName, shape);			
		}
		return shape;
	}
	
}
