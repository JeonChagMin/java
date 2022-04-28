package Test;

import java.util.Scanner;

public class D0820_32 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("영문대문자 입력 : ");
		String a = s.nextLine();
		char b = a.charAt(0);
		if (b >= 'A' && b <= 'Z') {
			for (char i = b; i <= 'Z'; i++) {
				System.out.println((char) i);
			}
		}
	}

}
