import java.util.Scanner;

public class D0903_2�� {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int studentNum = 0;
			int[] scores = null;

				System.out.println("----------------------------------------------------");
				System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
				System.out.println("----------------------------------------------------");
//				int selectNo = Integer.parseInt(scanner.nextLine());
//				int selectNo = scanner.nextInt();

				// �̰ɾ��� �� �ٸ��� scanner.nextInt �� ���� ���°�
//				nextLine�� ���⵵ �б� ������ nextInt �� �� �� ����.	
					System.out.print("�л��� > ");
//					studentNum = Integer.parseInt(scanner.nextLine());
					studentNum = scanner.nextInt();
					scores = new int[studentNum];
					for (int i = 0; i < studentNum; i++) {
						System.out.print("scores[" + i + "] >");
//						scores[i] = Integer.parseInt(scanner.nextLine());
						scores[i] = scanner.nextInt();
					}
					System.out.println();
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "] > " + scores[i]);
						System.out.println();
					}
					int sum = 0;
					int max = 0;
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if (max <= scores[i]) {
							max = scores[i];
						}

					}
					System.out.println();
					double ave = (double) sum / scores.length;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + ave);

			System.out.println("���α׷� ����");

		}

	}