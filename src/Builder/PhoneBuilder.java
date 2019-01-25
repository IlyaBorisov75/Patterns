package Builder;

public class PhoneBuilder {
	String mark = "iphone";
	String display = "ips";
	int camera = 13;
	String bodu = "white";
	
	
	public PhoneBuilder setMark(String mark) {
		this.mark = mark;
		return this;		
	}
	public PhoneBuilder setDisplay(String display) {
		this.display = display;
		return this;	
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;	
	}
	public PhoneBuilder setBodu(String bodu) {
		this.bodu = bodu;
		return this;	
	}
	
	Phone build() {
		Phone phone = new Phone();
		phone.setBodu(bodu);
		phone.setCamera(camera);
		phone.setDisplay(display);
		phone.setMark(mark);
		return phone;
	}
	
}
