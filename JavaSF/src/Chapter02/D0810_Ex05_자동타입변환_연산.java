package Chapter02;

public class D0810_Ex05_자동타입변환_연산 {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
//		byte 여도 연산을 하면 int 로 자동변환되기 때문에 최종 값도 int 로 바꿔야한다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue1+charValue2;
//		charValue1는 A의 코드화로 인해 숫자로 바뀌어서 최종 값이 int 로 바뀐다.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
//		int intValue5=10/4.0;
//		4.0은 int 가 아니라 double 이기 때문에 최종 값을 double 로 입력해야한다.
		double doubleValue = 10 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
//		double 로 하지 않았으면 0.5가 아니라 0이 값으로 나온다.

	}

}
