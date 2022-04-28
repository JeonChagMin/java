import java.util.Scanner;

public class D0811_마무리문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		문제1
//		String name = "김자바";
//		int age = 25;
//		String tell1 = "010", tell2 = "123", tell3 = "4567";
//		System.out.println("이름 : "+name);
//		System.out.print("나이 : "+age+"\n");
//		System.out.printf("전화 : %1$s-%2$s-%3$s",tell1,tell2,tell3);
		
//		문제2
//		System.out.print("첫번째 수 : ");
//		String strNum1 =s.next();
//
//		System.out.print("두번째 수 : ");
//		String strNum2 = s.next();
//		
//		int num1 =Integer.parseInt(strNum1);
//		int num2 =Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : "+result);
		
//		문제3
		System.out.print("이름을 입력해주세요 : ");
		String name1 = s.next();
		
		System.out.print("주민번호 앞 6자리를 입력해 주세요 : ");
		int num=s.nextInt();
		s.nextLine();
		System.out.print("전화번호를 입력해주세요 : ");
		String num1=s.nextLine();
		
		System.out.println("1. 이름 : "+name1);
		System.out.println("2. 주민번호 앞 6자리 : "+num);
		System.out.println("3. 전화번호 : "+num1);
		
		
	}

}
