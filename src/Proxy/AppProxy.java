package Proxy;

public class AppProxy {
	void app() {
		Film f = new ProxyFilm("D:/����/film.mkv");
		f.show();
	}
}
