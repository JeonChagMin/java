
public class Exam03_자동타입변환_정수 {

	public static void main(String[] args) {

		byte result1 = 10 + 20;
		System.out.println(result1);

		byte x = 10;
		byte y = 20;
		int result2 = x + y;
//		정수 + 정수가 되면 int 로 자동으로 변환한다.
		System.out.println(result2);

	}

}
