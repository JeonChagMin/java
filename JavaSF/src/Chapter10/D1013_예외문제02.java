package Chapter10;

import java.util.Scanner;

public class D1013_예외문제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("숫자 입력 : ");
				int x = s.nextInt();
				System.out.print("숫자 입력 : ");
				int y = s.nextInt();
				System.out.print("숫자 입력 : ");
				int z = s.nextInt();
				System.out.println("모든 값을 더한 값은 : "+(x+y+z));
				break;
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				s.next();
			}
		}

	}

}
