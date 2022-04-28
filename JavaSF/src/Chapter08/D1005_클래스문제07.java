package Chapter08;

import java.util.Scanner;

public class D1005_Ŭ��������07 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}

class Day {
	private String work; 
	void set(String work) { this.work=work;}
	String get() {return work;}
	void show() {
		if (work==null) {
			System.out.println("�����ϴ�");
		} else System.out.println(work+"�Դϴ�");
	}
	
}

class MonthSchedule{
	boolean a = true;
	Day[] d;
	int x,day;
	String work;
	Scanner s= new Scanner(System.in);

	MonthSchedule(int day) {
		this.d = new Day[day];
		this.day=day;
		for (int i = 0; i < day; i++) {
			d[i]=new Day();
		}
	}
	
	void input() {
		System.out.print("��¥(1~"+day+")");
		this.x=s.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		work= s.next();
		d[x-1].set(work);
	}
	
	void view() {
		System.out.print("��¥(1~"+day+")");
		x=s.nextInt();
		System.out.println(x+"���� �� ���� ");
		d[x-1].show();
	}
	
	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		while (a) {
		System.out.println("����(�Է� : 1, ���� : 2, ������ : 3)");
		int num =s.nextInt();
		switch (num) {
		case 1: this.input(); break;
		case 2: this.view(); break;
		case 3: this.finish(); a=false; break;
		}	

		}
		
	}
	
}
