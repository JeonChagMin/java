package Test;

import java.util.Scanner;

public class D0820_34 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("영문자 입력 : ");
		String a = s.nextLine();
		char b = a.charAt(0);
		if (b >= 'a' && b <= 'z') {
			for (char i = b; i <= 'z'; i++) {
				System.out.println((char) i);
			}
		} else if (b >= 'A' && b <= 'Z') {
			for (char j = 'A'; j <= b; j++) {
				System.out.println((char) j);
			}
		}
	}

}
