package Chapter10;

import java.util.Scanner;

public class D1013_���ܹ���02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("���� �Է� : ");
				int x = s.nextInt();
				System.out.print("���� �Է� : ");
				int y = s.nextInt();
				System.out.print("���� �Է� : ");
				int z = s.nextInt();
				System.out.println("��� ���� ���� ���� : "+(x+y+z));
				break;
			} catch (Exception e) {
				System.out.println("������ �Է����ּ���");
				s.next();
			}
		}

	}

}
