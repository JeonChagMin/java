package Chapter02;
import java.util.Scanner;

public class D0730_3_스캐너_문자 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("정수 숫자 입력 : ");
		int num1 = s.nextInt();
		System.out.print("실수 숫자 입력 : ");
		double num2 = s.nextDouble();
		System.out.print("문자열 입력 : ");
		String str = s.next();

		System.out.println("정수 : " + num1 + " , 실수 : " + num2 + "\n문자열 : " + str);

	}

}
