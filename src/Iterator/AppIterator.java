package Iterator;

public class AppIterator {
	public void app() {
		ConcretConteiner c = new ConcretConteiner();
		Iterator it = c.getIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
