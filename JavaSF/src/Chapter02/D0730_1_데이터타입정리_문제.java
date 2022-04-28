package Chapter02;

public class D0730_1_데이터타입정리_문제 {

	public static void main(String[] args) {

		/*
		 * System.out.println('A'+1); System.out.println('A'+"1");
		 * System.out.println("A"+1); System.out.println(5+"광주"+1);
		 * System.out.println('B'+'C');
		 * 
		 * 
		 * 1. 'A'는 문자 A의 코드값인 65 + 1 2. 'A'는 문자 A의 코드값이지만 뒤의 1이 ""안에 있기 때문에 String이 되어
		 * 연결하는 역할만 한다. 3. String A가 있기 때문에 연결만 한다. 4. String 광주 때문에 연결만 한다. 5. 문자 'B' 와
		 * 'C' 의 코드값이 나와서 실수 + 실수 이기 때문에 덧셈을 한다.
		 */
		// 66, A1, A1, 5광주1, 133

		int a = 5, b = 10, c = 15, d = 20;
		char c1 = 'A', c2 = 'B', c3 = 'C';

		System.out.println(a + b);
		System.out.println('A' + b);
		System.out.println(a + c1);
		System.out.println(b + "" + c2);
		System.out.println(a + c2 + b);
		System.out.println("a" + b + c3);
		System.out.println(a + b + c + d + "d" + d);
		// 괄호안에 있는 식에 ""다 있다고 무조건 String이 되는게 아니라 순서대로 계산을 하면서 String을 만나는부분에서 연결의 의미로
		// 바뀐다.

		// 15, 75, 70, 10B, 81, a10C, 50d20

		/*
		 * 데이터 타입 -String => 문자열 -정수 => byte : 1 byte = 8 bit => short : 2 byte = 16 bit
		 * => char : 2 byte = 16 bit ( 음수표현 못함, 유니코드 ) => int : 4 byte = 32 bit ( 정수 타입의
		 * 대표적인 예시 ) => long : 8 byte = 64 bit ( 쓸 경우 뒤에 L를 붙어야 인식이 가능하다. ) 숫자의 크기가 작아도
		 * 뒤에 L만 붙이면 long 타입이 된다.
		 * 
		 * -실수 => float : 4 byte = 32 bit ( 정수의 long 처럼 float은 뒤에 f를 붙어야 인식이 가능하다. ) =>
		 * double : 8 byte = 64 bit ( 기본으로 사용한다. )
		 */

//		float x = 100;
//		float y = 1.5F;
//		double z = 1.5;

	}

}
