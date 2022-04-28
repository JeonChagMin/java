package Chapter02;
import java.util.Scanner;

public class D0730_5_스캐너_응용문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = s.next();// 연속된 문자를 읽는다.
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();// 정수 값을 읽는다.
		System.out.print("키를 입력하세요(소수점 한자리까지) : ");
		double tall = s.nextDouble();// 실수 값을 읽는다.
		s.nextLine();
		/*
		 * nextLine은 전에 입력했던 enter부터 읽기 때문에 두번 입력하지 않으면 enter만 입력된다. enter를 스킵하기 위해 두 번
		 * 입력해야한다.
		 */
		System.out.print("주소를 입력하세요 : ");
		String add = s.nextLine();

		// System.out.print("당신의 이름은 : \""+name+"\"이고, 나이는 "+age+"입니다.\n키는 "+tall+"이고,
		// 주소는 "+add+"입니다." );
		System.out.print("당신의 이름은 : \"" + name);
		System.out.println("\"이고, 나이는 " + age + "입니다.");
		System.out.print("키는 " + tall + "이고, ");
		System.out.print("주소는 " + add + "입니다.");

	}

}
