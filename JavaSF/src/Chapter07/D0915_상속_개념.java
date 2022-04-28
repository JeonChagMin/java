package Chapter07;

public class D0915_상속_개념 {

	public static void main(String[] args) {
//		A a = new A();
//		a.aaa();
		B b = new B();
		b.aaa();
		b.bbb();
//		final 이 있는 곳은 상속과 관련된 어떠한 것도 할 수 없다.
	}

}

class A {
	int num = 5;
	String name = "A";

	public A() {
//		System.out.println("A 클래스 생성자");
	}

	void aaa() {
		System.out.println("A 클래스 aaa 메소드");
	}

	void bbb() {
		System.out.println("A 클래스 bbb 메소드");
	}
}

class B extends A {
	public B() {
//		A 클래스의 생성자 A 를 의미한다. 상위 클래스의 생성자를 의미한다.
//		System.out.println("B 클래스 생성자");
	}

	@Override
	void aaa() {
		System.out.println("B 클래스 aaa 메소드");
	}

	@Override
	void bbb() {
		super.bbb();
	}
}
