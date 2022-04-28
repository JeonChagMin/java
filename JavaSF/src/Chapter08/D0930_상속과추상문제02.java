package Chapter08;

public class D0930_상속과추상문제02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}

class IPTV extends ColorTv {
	private String ip;
	
	
	IPTV(String ip,int size, int color) {
		super(size, color);
		this.ip= ip;
		
	}
	
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소의 ");
		super.printProperty();
	}

}
