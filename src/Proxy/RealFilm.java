package Proxy;

public class RealFilm implements Film{

	String file;
	
	
	public RealFilm(String file) {
		this.file = file;
		load();
	}


	private void load() {
		System.out.println("��������..." + file);
	}


	@Override
	public void show() {
		System.out.println("�����" + file);
	}

}
