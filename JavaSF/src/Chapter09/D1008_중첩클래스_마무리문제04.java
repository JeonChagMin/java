package Chapter09;

public class D1008_중첩클래스_마무리문제04 {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();

	}
}

class CheckBox {
	OnSelectListener listener;

	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelet();
	}

	static interface OnSelectListener {
		void onSelet();
	}

}


class BackgroundChangeListener implements CheckBox.OnSelectListener {

	@Override
	public void onSelet() {
		System.out.println("배경을 변경합니다.");
	}

}

