package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D1013_���ܹ���03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		while (true) {
			if (x == 0) {

				try {
					System.out.print("����1 �Է� : ");
					x = s.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("������ �Է¹ٶ��ϴ�");
					s.nextLine();
				} 

			}
			if (x != 0) {

				try {	
					System.out.print("����2 �Է� : ");
					y = s.nextInt();
					System.out.println(x + " / " + y + " = " + x / y);
					break;

				} catch (InputMismatchException e) {
					System.out.println("������ �Է¹ٶ��ϴ�");
					s.nextLine();
				} catch (ArithmeticException e) {
					System.out.println("0���� ������ �����ϴ�.");
					s.nextLine();
				}
			}
		}

	}

}
