package Chapter08;

import java.util.Scanner;

public class D1007_��ü�迭�뵷������ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� ���� �Է� : ");
		int month=s.nextInt();
		int sum=0;
		Month[] m = new Month[month];
		for (int i = 0; i < m.length; i++) {
			System.out.println(i + 1 + "�� �뵷������");
			m[i] = new Month();
			sum+=m[i].getHmoney();
			System.out.println("���� �뵷�� ���忡 ����");
			System.out.println("���ݵ� �ݾ� : "+sum);
		}

		while (true) {
			System.out.print("���� �Է��ϼ��� : ");
			int mon = s.nextInt();
			if (mon == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else
				m[mon - 1].show();
			

		}

	}

}

class DayWork {
	private String work;
	private int money;

	DayWork() {
	}

	DayWork(String w, int m) {
		work = w;
		money = m;
	}

	void show() {
		System.out.println("���� ���� " + work + " ���� �ݾ� : " + money);
	}
}

class Month extends DayWork {
	private int hmoney;
	Scanner s;
	DayWork[] day;
	private int month;

	Month() {
		s = new Scanner(System.in);
		System.out.println("���� �뵷 : ");
		int h= s.nextInt();
		this.setHmoney(h);
		System.out.print("��¥ : ");
		int d = s.nextInt();

		day = new DayWork[d];
		for (int i = 0; i < day.length; i++) {
			System.out.println(i + 1 + "��");
			System.out.print("���� ���� : ");
			String work = s.next();
			if (work.equals("����")) {
				System.out.println("���� ���� �뵷 : " + hmoney);
			} else {
				System.out.print("���� �ݾ� : ");
				int money = s.nextInt();
				day[i] = new DayWork(work, money);
				hmoney -= money;
				if (hmoney >= 0) {
					System.out.println("���� ���� �뵷 : " + hmoney);
				} else {
					System.out.println("�뵷�� �ʰ��߽��ϴ�.");
					break;
				}
			}
		}
	}
	
	

	public int getHmoney() {
		return hmoney;
	}
	public void setHmoney(int hmoney) {
		this.hmoney += hmoney;
	}



	@Override
	void show() {
		System.out.print("���� �Է��ϼ��� : ");
		int n = s.nextInt();
		System.out.println(n + "���� ");
		day[n - 1].show();
	}

}