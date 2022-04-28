package Test;

import java.util.Scanner;

public class D0820_43 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("첫번 째 숫자 : ");
		int x = s.nextInt();
		System.out.print("첫번 째 숫자 : ");
		int y = s.nextInt();
		int max = (x > y) ? x : y;
		int min = (x < y) ? x : y;
		for (int i = min; i <= max; i++) {
			System.out.println("4 *" + i + " = " + 4 * i);
		}

	}

}
