package Test;

import java.util.Scanner;

public class D0820_29 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		
		System.out.print("첫번째숫자를 입력해주세요 : ");
		int a=s.nextInt();
		System.out.print("두번째숫자를 입력해주세요 : ");
		int b =s.nextInt();
		int max = (a>b) ? a : b;
		int min = (a<b) ? a : b;
		for (int i = min; i <=max; i++) {
			System.out.println(i);
		}
		
		
	}

}
