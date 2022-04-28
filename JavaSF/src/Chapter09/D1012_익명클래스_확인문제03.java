package Chapter09;

public class D1012_�͸�Ŭ����_Ȯ�ι���03 {

	public static void main(String[] args) {
		CheckBox1 checkBox = new CheckBox1();
		checkBox.setOnSelectListener(new CheckBox1.OnSelectListener1() {

			@Override
			public void onSelect() {
				System.out.println("����� �����մϴ�");
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

//	static �� ��쿡�� ��������.Ŭ�����̸��� �ƴ϶�, Ŭ���� �̸�.Ŭ�����̸��� ����Ѵ�. �Ǵ� import�� ����Ѵ�.
	static interface OnSelectListener1 {
		void onSelect();
	}
}