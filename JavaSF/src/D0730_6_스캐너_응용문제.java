import java.util.Scanner;

public class D0730_6_스캐너_응용문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		이상, 이하 계산하기
//		System.out.print("숫자 하나를 입력하세요 : ");
//		int a = s.nextInt();
//
//		if (a >= 50) {
//			System.out.println("50이상의 숫자입니다.");
//		} else {
//			System.out.println("50이하의 숫자입니다.");
//		}

//		짝수, 홀수 계산하기
//		if (a % 2 > 0) {
//			System.out.println("숫자 " + a + "는 홀수입니다.");
//		} else {
//			System.out.println("숫자 " + a + "는 짝수입니다.");
//		}

//		두 개의 정수를 입력받고 큰 수에서 작은 수 뺴기
//		System.out.print("숫자 하나를 입력해주세요 : ");
//		int x = s.nextInt();
//		System.out.print("숫자 하나를 입력해주세요 : ");
//		int y = s.nextInt();
//		if (x > y) {
//			System.out.println(x - y);
//		} else {
//			System.out.println(y - x);
//		}

//		자신의 bmi 측정하기
//		System.out.print("키를 입력해주세요(cm가 아닌 m로 적어주세요) : ");
//		double a = s.nextDouble();
//		System.out.print("몸무게를 입력해주세요 : ");
//		double b = s.nextDouble();
//		double c = (b/(a*a));
//		System.out.print("당신의 bmi는 "+c);
//		
//		if(c>23) {
//			System.out.println("당신은 과체중입니다. 운동하세요.");
//		}else {
//			System.out.println("정상이시네요. 까비");
//		}
		System.out.print("분을 입력해주세요 : ");
		int min = s.nextInt();

		if (min > 60) {
			System.out.println("다시 입력해주세요.");
			System.out.println("분을 입력해주세요 : ");
			int mi = s.nextInt();
			System.out.print(mi + "분입니다.");
		} else {
			System.out.println(min + "분입니다.");
		}
	}
}
