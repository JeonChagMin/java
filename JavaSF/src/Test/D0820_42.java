package Test;

import java.util.Scanner;

public class D0820_42 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int x = s.nextInt();
		for (int i = 9; i >= 1; i--) {
			System.out.println(x + " * " + i + " = " + x * i);

		}

	}

}
