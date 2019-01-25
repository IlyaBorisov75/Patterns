package Proxy;

public class RealFilm implements Film{

	String file;
	
	
	public RealFilm(String file) {
		this.file = file;
		load();
	}


	private void load() {
		System.out.println("Загрузка..." + file);
	}


	@Override
	public void show() {
		System.out.println("Показ" + file);
	}

}
