package Test;

import java.util.Scanner;

public class D0820_36 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���� �ҹ��� �Է� : ");
		String a = s.nextLine();
		char b = a.charAt(0);
		if (b >= 'a' && b <= 'z') {
			for (char i = 'z'; i >= b; i--) {
				System.out.println(i);
			}

		}
		// int c = (int)b;
//		for (int i = c; i >=97; i--) {
//			System.out.println((char)i);
//		}
	}

}
