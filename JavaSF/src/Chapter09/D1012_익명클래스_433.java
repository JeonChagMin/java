package Chapter09;

public class D1012_익명클래스_433 {

	public static void main(String[] args) {
		Button button1 = new Button();
		Button button2 = new Button();
		Button.OnClickListener listener = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("전화를 겁니다");
			}
		};
		
		listener.onClick();
		
	}

}

class Button {
	OnClickListener Listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.Listener=listener;
	}
	
	void touch() {
		Listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
