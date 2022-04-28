
public class Exam01_자동타입변환2단원 {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '가';
		intValue = charValue; //'가'라는 유니코드 값을 포함되어 있다.
		System.out.println("가의 유니코드 : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue :" + longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);

	}

}
