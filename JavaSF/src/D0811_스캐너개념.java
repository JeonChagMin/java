import java.util.Scanner;

public class D0811_스캐너개념 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		기본 형태가 아닌 것은 바로 입력되는 것이 아닌 주소를 불러오는 형태로 존재한다.
//		nextInt 가 실행을 하기 위한 명령어는 enter 이다. 숫자만 입력하고 가만히 있으면 안된다.
//		System.out.print("정수 하나를 입력하세요 : ");
//		int num=s.nextInt();
//		System.out.print("실수 하나를 입력하세요 : ");
//		double num1=s.nextDouble();
//		System.out.print("문자 하나를 입력하세요 : ");
//		String ch = s.next();
//		System.out.print("문자열 입력하세요 : ");
//		String str=s.next();
//		System.out.println(num);
//		System.out.println(num1);
//		System.out.println(ch);
//		System.out.println(str);

		System.out.print("이름을 입력하세요 : ");
		String name = s.next();
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		System.out.print("키를 입력하세요 : ");
		double tall = s.nextDouble();
		s.nextLine();
//		문자열에서 띄어쓰기까지 읽어내기 위해서는 next 만 쓰는 것이 아니라 nextLine 을 입력해야 한다.
//		nextLine 은 전에 입력한 enter 까지 읽어내기 때문에 전에 입력한 enter 를 제거하기 위해 두번 쓴다.
		System.out.print("주소를 입력하세요 : ");
		String add = s.nextLine();

		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "입니다.");
		System.out.println("제 키는 " + tall + "입니다.");
		System.out.println("제 주소는 " + add + "입니다.");

	}

}
