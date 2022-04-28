
public class Exam02_강제타입변환 {

	public static void main(String[] args) {

		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

//		강제 타입 변환을 캐스팅(casting)이라고 한다. 
//		캐스팅을 하는 경우 크기를 오버하면 오버한 만큼 cycle에 돌아서 올라간다
//		ex 
//		int x = 128;
//		byte y = (byte) x;
//		=-128로 값이 나온다.

	}

}
