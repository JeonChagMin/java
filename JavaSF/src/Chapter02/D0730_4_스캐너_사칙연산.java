package Chapter02;
import java.util.Scanner;

public class D0730_4_스캐너_사칙연산 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 : ");
		int n1 = s.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int n2 = s.nextInt();

		System.out.println("두 수의 합 : " + (n1 + n2));
		System.out.println("두 수의 차 : " + (n1 - n2));
		System.out.println("두 수의 곱 : " + n1 * n2);
		System.out.println("두 수의 나누기 : " + n1 / n2);
		System.out.println("두 수의 나머지 : " + n1 % n2);

//		반 평균 계산하는 방법
//		System.out.print("1반의 성적은 : ");
//		int a = s.nextInt();
//		System.out.print("2반의 성적은 : ");
//		int b = s.nextInt();
//		System.out.print("3반의 성적은 : ");
//		int c = s.nextInt();
//		System.out.print("4반의 성적은 : ");
//		int d = s.nextInt();
//		
//		System.out.println("1반의 성적은 : "+a);
//		System.out.println("2반의 성적은 : "+b);
//		System.out.println("3반의 성적은 : "+c);
//		System.out.println("4반의 성적은 : "+d);
//		System.out.println("학년 평균은 : "+(a+b+c+d)/4);

//		System.out.print("구구단을 외우자");
//		int n=s.nextInt();
//		
//		System.out.println(n+"*1="+n*1);
//		System.out.println(n+"*2="+n*2);
//		System.out.println(n+"*3="+n*3);
//		System.out.println(n+"*4="+n*4);
//		System.out.println(n+"*5="+n*5);
//		System.out.println(n+"*6="+n*6);
//		System.out.println(n+"*7="+n*7);
//		System.out.println(n+"*8="+n*8);
//		System.out.println(n+"*9="+n*9);

	}

}
