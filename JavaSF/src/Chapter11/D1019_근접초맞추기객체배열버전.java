package Chapter11;

import java.util.Calendar;
import java.util.Scanner;

public class D1019_�����ʸ��߱ⰴü�迭���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �� : ");
		int num = s.nextInt();
		Player p[] = new Player[num];
		System.out.println("�� �ʿ� ������ ���ΰ�");
		int o = s.nextInt();
		int second = 0;
		int second1 = 0;
		int index = 0;
		for (int i = 0; i < p.length; i++) {
			System.out.print("������ �̸� : ");
			String name = s.next();
			s.nextLine();
			System.out.println(name+"�� ����");
			System.out.println("����");
			System.out.print("���͸� �Է����ּ���");
			String a = s.nextLine();
			if (a.equals("")) {
				Calendar now = Calendar.getInstance();
				second = now.get(Calendar.SECOND);
				System.out.print("�ʴ� : " + second);
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. ó������ �ٽ��������ּ���.");
				break;
			}
			String b = s.nextLine();
			if (b.equals("")) {
				Calendar now1 = Calendar.getInstance();
				second1 = now1.get(Calendar.SECOND);
				System.out.println("�ʴ� : " + second1);
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. ó������ �ٽ��������ּ���.");
				break;
			}
			if (second1 > second) {
				p[i]=new Player(name,second1-second);
			} else {
				p[i]=new Player(name,second1 + 60 - second);
			}
			
		}
		if (p[0]!=null) {
			
		for (int i = 0; i < p.length; i++) {
			p[i].cal(o);
		}
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (p[i].result>p[j].result) {
					index = i;
				} else {
					index = j;
				}
			}
		}
		System.out.println("������ "+p[index].name+"�� ��ǥ ���� "+o+"�� "+p[index].result+"���̷� ���� �����Ͽ� ����߽��ϴ�.");
		}

		
	}

}

class Player {
	String name;
	int second;
	int result;
	
	Player(String name, int se) {
		this.name = name;
		second=se;
	}
	
	void cal(int o) {
		this.result = Math.abs(o-second);
	}
}
