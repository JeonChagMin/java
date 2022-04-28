import java.util.Scanner;

public class D0811_prinf개념 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.printf("형식문자", 변수 또는 리터럴);
//		형식문자 (%)
//		정수 => 10진수(d), 8진수(o), 16진수(x)
//		실수 => f 기본적으로 6자리를 출력한다.( d는 10진수에서 쓰고 있기 때문에 float 의 f 를 쓴다. )
//		문자열 => s ( String 의 s )

		int a = 50;
		int b = 30;
		System.out.printf("a변수의 10진수 값은 : %d\n", a);
		System.out.printf("a변수의 8진수 값은 : %o\n", a);
		System.out.printf("a변수의 16진수 값은 : %x\n", a);
		System.out.printf("%d", 50);
//		
//		System.out.printf("a변수 : %d , b변수 : %d\n", a , b);
//		한번에 두개의 값도 입력이 가능하다.

//		문제1 정수
//		10진수 하나를 입력하세요 : 00
//		입력받은 수(10진수) : 00
//		입력받은 수(8진수) : 00
//		입력받은 수(16진수) : 00

//		System.out.print("10진수 하나를 입력하세요 : ");
//		int a = s.nextInt();
//
//		System.out.printf("입력받은 수(10진수) : %d\n", a);
//		System.out.printf("입력받은 수(8진수) : %o\n", a);
//		System.out.printf("입력받은 수(16진수) : %x\n", a);

//		문제2 실수
//		System.out.print("실수를 입력하세요 : ");
//		double b = s.nextDouble();
//		
//		System.out.println("입력 받은 수 "+b);
//		System.out.printf("%.2f",b);
//		출력하고자 하는 자리 수는 .를 찍고 숫자를 적으면 된다.

//		문제3 문자열
//		System.out.print("이름을 입력하세요 : ");
//		String name = s.next();
//		System.out.println("이름 출력 : " + name);
//		System.out.printf("이름 출력 : %s", name);
//		문자열은 위 아래 둘다 사용이 가능하다.
		
//		문제4 실수 연산
//		소수점이하 4자리 수 입력
//		System.out.print("첫번째 수 : ");
//		double n1 = s.nextDouble();
//		System.out.print("두번째 수 : ");
//		float n2 = s.nextFloat();
//
//		출력되는 값은 소수점이하 3자리로
//		System.out.printf("두 수의 합 : %.3f\n", n1 + n2);
//		System.out.printf("두 수의 차 : %.3f\n", n1 - n2);
//		System.out.printf("두 수의 곱 : %.3f\n", n1 * n2);
//		System.out.printf("두 수의 나눗셈 : %.3f", n1 / n2);
//		뒤에 바로 연산이 가능하다. 앞에 ""이 있어도 괄호를 입력안해도 된다.
	
				
	}

}
