package Chapter07;

public class D0923_�⺻����02 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println("x="+c.getX());

	}

}

class Parent2 {
	int x = 100;

//	super() ������ 3
	Parent2() {
		this(200);
	}

//	this �� ���ؼ� 4
	Parent2(int x) {
//		super(); object ���� Ŭ����
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child2 extends Parent2 {
	int x = 3000;

//	�Ű��������� 1
	Child2() {
		this(1000);
	}

//	2
	Child2(int x) {
//		super();�����ִ�
		this.x = x;
	}
}
