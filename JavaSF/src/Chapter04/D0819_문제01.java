package Chapter04;

import java.util.Scanner;

public class D0819_����01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("���� 4�ڸ��� �Է����ּ��� : ");
		String num = s.next();
		if (!(num.length() == 4)) {
			System.out.println("4���ڰ� �ƴմϴ�.");
		}

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (!(ch >= '0' && ch <= '9'))
				System.out.println("�Էµ����Ͱ� ���ڰ� �ƴմϴ�.");
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
			System.out.println("<���>");
			System.out.println("===" + dan2 + "��===");
			for (int j = x1; j <= x; j++) {
				System.out.println(dan2 + " * " + j + " = " + dan2 * j);

			}
			System.out.println("===" + dan1 + "��===");

			for (int j = x1; j <= x; j++) {
				System.out.println(dan1 + " * " + j + " = " + dan1 * j);
			}
		} else {
			System.out.println();
		}

	}
}
