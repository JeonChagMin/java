package Test;

import java.util.Scanner;

public class D0820_31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("ù��°���ڸ� �Է����ּ��� : ");
		double a = s.nextDouble();
		System.out.print("�ι�°���ڸ� �Է����ּ��� : ");
		double b = s.nextDouble();
		double max = (a > b) ? a : b;
		double min = (a < b) ? a : b;

		System.out.println("ū�� : " + max);
		System.out.println("������ : " + min);

	}

}
