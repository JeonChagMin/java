package Test;

import java.util.Scanner;

public class D0820_45 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int y = (int) (Math.random() * 100 + 1);
		System.out.println("***1~100���� ���� ���ߴ� ����***");
		System.out.println(y);
		boolean c = true;
		int con = 0;
		while (c) {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			int x = s.nextInt();
			if (x > y) {
				System.out.println("Ʋ�Ƚ��ϴ�. �� ���� �� �Դϴ�.");
				con++;
			} else if (x < y) {
				System.out.println("Ʋ�Ƚ��ϴ�. �� ū �� �Դϴ�.");
				con++;
			} else if (y == x) {
				System.out.println("�����Դϴ�.");
				con++;

				c = false;
			}
		}
		System.out.println("�� ���� Ƚ���� : " + con);
	}
}

//		���� 1~100���� �������� �ϳ� ���� �� ��ĳ�ʷ� ���� �Է��� ���� �� ���� ���� ��� �������� ����� �ϰ� �ƴϸ� �ٽ� ���ư��� ���
