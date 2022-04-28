package Chapter02;

public class D0812_exam01 {

	public static void main(String[] args) {

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		byte b = 100;
		int result3 = -b;
		//연산을 하고 난 후에는 int 로 바뀐다.
		System.out.println("result3=" + result3);

	}

}
