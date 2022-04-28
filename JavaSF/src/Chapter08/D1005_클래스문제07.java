package Chapter08;

import java.util.Scanner;

public class D1005_클래스문제07 {

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
			System.out.println("없습니다");
		} else System.out.println(work+"입니다");
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
		System.out.print("날짜(1~"+day+")");
		this.x=s.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		work= s.next();
		d[x-1].set(work);
	}
	
	void view() {
		System.out.print("날짜(1~"+day+")");
		x=s.nextInt();
		System.out.println(x+"일의 할 일은 ");
		d[x-1].show();
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while (a) {
		System.out.println("할일(입력 : 1, 보기 : 2, 끝내기 : 3)");
		int num =s.nextInt();
		switch (num) {
		case 1: this.input(); break;
		case 2: this.view(); break;
		case 3: this.finish(); a=false; break;
		}	

		}
		
	}
	
}
