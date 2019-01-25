package Proxy;

public class AppProxy {
	void app() {
		Film f = new ProxyFilm("D:/Кино/film.mkv");
		f.show();
	}
}
