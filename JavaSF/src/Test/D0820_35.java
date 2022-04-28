package Test;

import java.util.Scanner;

public class D0820_35 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("영문 소문자 입력 : ");
		String a = s.nextLine();
		char b = a.charAt(0);
		for (char i = 'z'; i >= b; i--) {
			System.out.println((char) i);
		}
	}

}
