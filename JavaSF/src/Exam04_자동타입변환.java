
public class Exam04_자동타입변환 {

	public static void main(String[] args) {

		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
//		기본 요소는 int 지만 long 이 더 크기 때문에 long 으로 자동변환된다.

	}

}
