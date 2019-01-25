package Proxy;

public class ProxyFilm implements Film{

	String file;
	RealFilm film;
	
	public ProxyFilm(String file) {
		this.file = file;
	}



	@Override
	public void show() {
		if (film == null) {
			film = new RealFilm(file);
		}
		film.show();
	}

}
