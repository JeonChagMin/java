package Chapter07;

public class D0923_기분문제0304 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH : "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : "+t.getVolume());
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : "+ t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : "+ t.getChannel());

	}

}

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int prevChannel;
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int channel) {
		if (channel >= MIN_CHANNEL && channel<=MAX_CHANNEL) {
		this.prevChannel=this.channel;
		this.channel = channel;
		}
	}
	
	int getVolume() {
		return volume;
	}
	
	void setVolume(int volume) {
		if (volume>=MIN_VOLUME && volume<=MAX_VOLUME) {
		this.volume=volume;
		}
	}
	
}
