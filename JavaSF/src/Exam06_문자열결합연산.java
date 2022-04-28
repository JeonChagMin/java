
public class Exam06_문자열결합연산 {

	public static void main(String[] args) {

		int value = 10 + 2 + 8;
		System.out.println("value : " + value);

		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);

		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);

		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);

		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);
//		괄호 안에 숫자부터 먼저 연산하기 때문에 아래만 2 + 8 이 계산하고 나온다.

	}

}
