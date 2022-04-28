package Chapter09;

public class D1012_익명클래스_확인문제03 {

	public static void main(String[] args) {
		CheckBox1 checkBox = new CheckBox1();
		checkBox.setOnSelectListener(new CheckBox1.OnSelectListener1() {

			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다");
			}
		});
		checkBox.select();
	}

}

class CheckBox1 {
	OnSelectListener1 listener;

	void setOnSelectListener(OnSelectListener1 listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

//	static 인 경우에는 참조변수.클래스이름이 아니라, 클래스 이름.클래스이름을 써야한다. 또는 import를 써야한다.
	static interface OnSelectListener1 {
		void onSelect();
	}
}