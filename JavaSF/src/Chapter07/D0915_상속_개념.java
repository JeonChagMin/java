package Chapter07;

public class D0915_���_���� {

	public static void main(String[] args) {
//		A a = new A();
//		a.aaa();
		B b = new B();
		b.aaa();
		b.bbb();
//		final �� �ִ� ���� ��Ӱ� ���õ� ��� �͵� �� �� ����.
	}

}

class A {
	int num = 5;
	String name = "A";

	public A() {
//		System.out.println("A Ŭ���� ������");
	}

	void aaa() {
		System.out.println("A Ŭ���� aaa �޼ҵ�");
	}

	void bbb() {
		System.out.println("A Ŭ���� bbb �޼ҵ�");
	}
}

class B extends A {
	public B() {
//		A Ŭ������ ������ A �� �ǹ��Ѵ�. ���� Ŭ������ �����ڸ� �ǹ��Ѵ�.
//		System.out.println("B Ŭ���� ������");
	}

	@Override
	void aaa() {
		System.out.println("B Ŭ���� aaa �޼ҵ�");
	}

	@Override
	void bbb() {
		super.bbb();
	}
}
