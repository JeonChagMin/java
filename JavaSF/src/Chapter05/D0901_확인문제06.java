package Chapter05;

import java.util.Scanner;

public class D0901_Ȯ�ι���06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("----------------------------------------------------");
			System.out.print("���� > ");

//			int selectNo = Integer.parseInt(scanner.nextLine());
			int selectNo = scanner.nextInt();

			// �̰ɾ��� �� �ٸ��� scanner.nextInt �� ���� ���°�
//			nextLine�� ���⵵ �б� ������ nextInt �� �� �� ����.	
			if (selectNo == 1) {
				System.out.print("�л��� > ");
//				studentNum = Integer.parseInt(scanner.nextLine());
				studentNum = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "] >");
//					scores[i] = Integer.parseInt(scanner.nextLine());
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > " + scores[i]);
					System.out.println();
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max <= scores[i]) {
						max = scores[i];
					}

				}
				double ave = (double) sum / scores.length;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + ave);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}

}
