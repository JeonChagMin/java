package Chapter02;
import java.util.Scanner;

public class D0730_2_스캐너 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // scanner s( 변수이기 때문에 얼마든지 변경 가능하다. )
		System.out.print("a의 값 입력 : "); // 무엇을 입력해야 하는지 공지해주는 역할.
		int a = s.nextInt();

		System.out.print("b의 값 입력 : "); // 두개 넘게 설정을 하고 있을때에는 스캐너를 또 하지 않고 변수만 추가해주면 된다.
		int b = s.nextInt();

		System.out.print("c의 값 입력 : ");
		int c = s.nextInt();

		System.out.printf("국어의 값 입력 : ");
		int 국어 = s.nextInt();

		System.out.println("a의 값은 " + a + "입니다");
		System.out.println("b의 값은 " + b + "입니다");
		System.out.println("c의 값은 " + c + "입니다");

//		System.out.println("a와 b의 덧셈은 " + (a + b) + "입니다");
//		System.out.println("a와 b의 뺄셈은 " + (a - b) + "입니다");
//		System.out.println("a와 b의 곱셈은 " + a * b + "입니다");

		if (a + b > c) {
			System.out.println("점심시간입니다.");
		} else {
			System.out.println("아직 아닙니다.");
		}
		System.out.println("평균은 " + ((a + b + c) / 3) + "입니다");

		System.out.println("국어 점수는 " + 국어 + "입니다.");

	}

}
