package Chapter04;

import java.util.Scanner;

public class D0819_문제01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("숫자 4자리를 입력해주세요 : ");
		String num = s.next();
		if (!(num.length() == 4)) {
			System.out.println("4글자가 아닙니다.");
		}

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (!(ch >= '0' && ch <= '9'))
				System.out.println("입력데이터가 숫자가 아닙니다.");
		}
		if (num.length() == 4) {
			int ch1 = num.charAt(0);
			int ch2 = num.charAt(1);
			int ch3 = num.charAt(2);
			int ch4 = num.charAt(3);
			ch1 = (ch1 - '0');
			ch2 = (ch2 - '0');
			ch3 = (ch3 - '0');
			ch4 = (ch4 - '0');

			int dan1 = (ch1 > ch2) ? ch1 : ch2;
			int dan2 = (ch1 < ch2) ? ch1 : ch2;
			int x = (ch3 > ch4) ? ch3 : ch4;
			int x1 = (ch3 < ch4) ? ch3 : ch4;
			System.out.println("<출력>");
			System.out.println("===" + dan2 + "단===");
			for (int j = x1; j <= x; j++) {
				System.out.println(dan2 + " * " + j + " = " + dan2 * j);

			}
			System.out.println("===" + dan1 + "단===");

			for (int j = x1; j <= x; j++) {
				System.out.println(dan1 + " * " + j + " = " + dan1 * j);
			}
		} else {
			System.out.println();
		}

	}
}
