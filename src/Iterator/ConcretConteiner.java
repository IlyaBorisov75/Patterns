package Iterator;

public class ConcretConteiner implements Container{
	String[] tasks = {"Дом", "Улица", "Фонарь"};

	@Override
	public Iterator getIterator() {
		return new ConcretIterator();
	}
	
	
	private class ConcretIterator implements Iterator{
		int index = 0;
		
		@Override
		public boolean hasNext() {
			if (index <tasks.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return tasks[index++];
		}
		
	}
}
