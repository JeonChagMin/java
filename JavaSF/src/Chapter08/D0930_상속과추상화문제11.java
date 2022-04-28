package Chapter08;

import java.util.Scanner;

public class D0930_상속과추상화문제11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시요>>");
		int x = s.nextInt();
		int y = s.nextInt();
		String z = s.next();
		Calc c = new Calc(x, y);
		if (z.equals("+")) {
			c=new Add(x,y);
			c.setValue(x, y);
			System.out.println(c.calculate());
		}
		if (z.equals("-")) {
			c=new Sub(x,y);
			c.setValue(x, y);
			System.out.println(c.calculate());
		}
		if (z.equals("*")) {
			c=new Mul(x,y);
			c.setValue(x, y);
			System.out.println(c.calculate());
		}
		if (z.equals("/")) {
			c=new Div(x,y);
			c.setValue(x, y);
			System.out.println(c.calculate());
		}

	}

}

class Calc {
	int a, b;

	void setValue(int a, int b) {
	}

	int calculate() {
		return 0;
	}

	Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Add extends Calc {

	Add(int a, int b) {
		super(a, b);
	}

	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a+b;
	}

}

class Sub extends Calc {

	Sub(int a, int b) {
		super(a, b);
	}

	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a-b;
	}

}

class Mul extends Calc {

	Mul(int a, int b) {
		super(a, b);
	}

	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return a*b;
	}

}

class Div extends Calc {

	Div(int a, int b) {
		super(a, b);
	}

	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}

	@Override
	int calculate() {
		return (int)a/b;
	}

}