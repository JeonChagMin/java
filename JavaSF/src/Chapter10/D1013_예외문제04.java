package Chapter10;

import java.util.Scanner;

public class D1013_���ܹ���04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int play = 0;
		int result = (int) (Math.random() * 100) + 1;
		System.out.println("���� "+result);
		while (true) {
			int num =0;
			try {
				System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
				num = s.nextInt();

			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���");
				s.next();
			}

			play++;
			if (num!=0) {
				
			if (result>num) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			else if (result<num) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			
			if (result==num) {
				System.out.println("������ϴ�");
				System.out.println("�õ�Ƚ���� "+play+"���Դϴ�.");
				break;
			}
			}
		}

	}

}
