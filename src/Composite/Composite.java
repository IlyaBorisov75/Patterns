package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shapes{
	List<Shapes> components = new ArrayList<>();
	
	public void addComponent(Shapes component) {
		components.add(component);
	}
	public void removeComponent(Shapes component) {
		components.remove(component);
	}

	@Override
	public void draw() {
		for(Shapes component: components) {
			component.draw();
		}
	}

}
