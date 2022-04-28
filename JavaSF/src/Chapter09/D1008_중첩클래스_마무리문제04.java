package Chapter09;

public class D1008_��øŬ����_����������04 {

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
		System.out.println("����� �����մϴ�.");
	}

}

