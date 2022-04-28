package Test;

import java.util.Scanner;

public class D0820_15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("영문자 하나를 입력 :");
		String a = s.nextLine();
		char b = a.charAt(0);
		
		if (b>='a'&&b<='z') {
			System.out.println("소문자");
			
		}else {
			System.out.println("대문자");
		}
	}

}