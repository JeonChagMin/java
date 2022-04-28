package Test;

import java.util.Scanner;

public class D0820_31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째숫자를 입력해주세요 : ");
		double a = s.nextDouble();
		System.out.print("두번째숫자를 입력해주세요 : ");
		double b = s.nextDouble();
		double max = (a > b) ? a : b;
		double min = (a < b) ? a : b;

		System.out.println("큰수 : " + max);
		System.out.println("작은수 : " + min);

	}

}
