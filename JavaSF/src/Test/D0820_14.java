package Test;

import java.util.Scanner;

public class D0820_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("문자 하나를 입력 :");
		String a = s.nextLine();
		char b = a.charAt(0);
		
		if (b>='0'&&b<='9') {
			System.out.println("숫자");
			
		}else {
			System.out.println("숫자아님");
		}
	}

}
