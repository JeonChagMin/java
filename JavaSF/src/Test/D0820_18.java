package Test;

import java.util.Scanner;

public class D0820_18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 : ");
		String x=s.nextLine();
		char a = x.charAt(7);
		if (a=='1') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다");
		}
	}

}
