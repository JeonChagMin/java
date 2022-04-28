package Chapter06;

public class D0910_클래스_기본문제06 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		t.channelDown();
		t.voulumeDown();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		t.volume=100;
		t.channerlUp();
		t.volumeUp();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);

	}

}

class Tv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	void turnOnOff() {
		if (isPowerOn==true) {
			this.isPowerOn = false;
		}else {
			this.isPowerOn = true;
		}
	}
	void volumeUp() {
		if (volume<MAX_VOLUME) {
			volume++;
		}
	}
	
	void voulumeDown() {
		if (volume>MIN_VOLUME) {
			volume--;
		}
	}
	
	void channerlUp() {
		channel++;
		if (channel>MAX_CHANNEL) {
			channel=MIN_CHANNEL;
		}
	}
	
	void channelDown() {
		channel--;
		if (channel<MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		}
	}
}
