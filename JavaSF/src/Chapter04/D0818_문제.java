package Chapter04;

import java.util.Scanner;

public class D0818_문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("아무거나 입력하세요 : ");
//		String str ="13345";
		String str = s.next();
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
//			문자열은 각각의 위치에 따른 index가 있다.
			if (!(ch >= '0' && ch <= '9')) {
				isNum = false;
			}
		}
		if (isNum) {
			System.out.println("숫자");

//			if (isNum) {
//				int sum=0;
//				for (int j = 0; j < str.length(); j++) {
//					char ch1=str.charAt(j);
//					sum=sum+(ch-'0');
//					}
//				System.out.println(str +"의 합계 : "+sum);
		} else {
			System.out.println("숫자가 아님");

		}

//		6.
//		for (int i = 1; i <= 6; i++) {
////			System.out.println("첫번째 : "+i);
//			for (int j = 1; j <= 6; j++) {
////				System.out.println("두번째 : "+j);
//				if (i + j == 6) {
//					System.out.println(i + " 와 " + j);
//				}
//			}
//
//		}

//		7.
//		2x+4y=10의 모든 해를 구하세요, x와 y는 모두 정수이고 범위는 0 ~ 10이다.
//		for (int x = 0; x <=10; x++) {
//			for (int y = 0; y <11; y++) {
//				if (2*x+4*y==10) {
//					System.out.println("x의 값은 "+x+"이고, y의 값은 : "+y+"입니다");
//				}
//				
//			}
//			
//		}

	}

}
