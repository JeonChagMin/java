package Chapter09;

public class D1012_익명클래스_로컬변수 {

	public static void main(String[] args) {
		Annoymous anony = new Annoymous();
		anony.method(0, 0);

	}

}

 interface Calculatable {
public int sum();
}

class Annoymous {
	private int field;

	void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		Calculatable c = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}

		};

		System.out.println(c.sum());
	}
}
