package Test;

import java.util.Scanner;

public class D0820_37 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = s.next();
		boolean c = true;
		for (int i = 0; i < str.length(); i++) {
//	    length 는 메소드이기 때문에 괄호를 넣어야한다.
			char b = str.charAt(i);
			if (b >= '0' && b <= '9') {
				c = true;
			} else {
				c = false;
			}
		}
		if (c) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자아님");
		}
	}

}
