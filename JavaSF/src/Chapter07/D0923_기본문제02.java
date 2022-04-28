package Chapter07;

public class D0923_기본문제02 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println("x="+c.getX());

	}

}

class Parent2 {
	int x = 100;

//	super() 때문에 3
	Parent2() {
		this(200);
	}

//	this 로 인해서 4
	Parent2(int x) {
//		super(); object 상위 클래스
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child2 extends Parent2 {
	int x = 3000;

//	매개변수없는 1
	Child2() {
		this(1000);
	}

//	2
	Child2(int x) {
//		super();숨겨있는
		this.x = x;
	}
}
