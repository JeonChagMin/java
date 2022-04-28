package Test;

import java.util.Scanner;

public class D0820_38 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = s.next();
		int sum = 0;
		boolean c = true;
		for (int i = 0; i < str.length(); i++) {
			char b = str.charAt(i);

			if (b >= '0' && b <= '9') {
				c = true;
				sum += (int) b - '0';
			} else {
				c = false;
			}
		}
		if (c) {
			System.out.println("숫자");
			System.out.println(sum);
		} else {
			System.out.println("숫자아님");
		}

	}

}