package Chapter11;

import java.util.Calendar;
import java.util.Scanner;

public class D1019_�����ʸ��߱���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� �ο� �� : ");
		int num = s.nextInt();
		String player[] = new String[num];
		int se[] = new int[num];
		int result[] = new int[num];
		int index = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("������ �̸� : ");
			String a = s.next();
			player[i] = a;
		}

		System.out.print("�� �ʿ� ������ ������ : ");
		int o = s.nextInt();
		s.nextLine();
		int second = 0;
		int second1 = 0;
		for (int i = 0; i < num; i++) {
			System.out.println(player[i]);
					System.out.print("����");
					String a = s.nextLine();
					if (a.equals("")) {
						Calendar now = Calendar.getInstance();
						second = now.get(Calendar.SECOND);
						System.out.print("�ʴ� : " + second);
					}
					String b = s.nextLine();
					if (b.equals("")) {
						Calendar now1 = Calendar.getInstance();
						second1 = now1.get(Calendar.SECOND);
						System.out.println("�ʴ� : " + second1);
					}
					if (second1 > second) {
						se[i] = second1 - second;
					} else {
						se[i] = second1 + 60 - second;
					}
		}
		for (int i = 0; i < se.length; i++) {
			result[i]=Math.abs(o-se[i]);
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 1; j < result.length; j++) {
				if (result[i]>=result[j]) {
					index = i;
				} else {
					index = j;
				}
			}
		}
		System.out.println("������ "+player[index]+"�� ��ǥ ���� "+o+"�� "+result[index]+"���̷� ���� �����Ͽ� ����߽��ϴ�.");
		
		
	}
}
