package Chapter08;

import java.util.Scanner;

public class D1007_객체배열용돈기입장 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇 월 인지 입력 : ");
		int month=s.nextInt();
		int sum=0;
		Month[] m = new Month[month];
		for (int i = 0; i < m.length; i++) {
			System.out.println(i + 1 + "월 용돈기입장");
			m[i] = new Month();
			sum+=m[i].getHmoney();
			System.out.println("남은 용돈은 통장에 저금");
			System.out.println("저금된 금액 : "+sum);
		}

		while (true) {
			System.out.print("월을 입력하세요 : ");
			int mon = s.nextInt();
			if (mon == 0) {
				System.out.println("프로그램을 종료합니다.");
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
		System.out.println("지출 내용 " + work + " 지출 금액 : " + money);
	}
}

class Month extends DayWork {
	private int hmoney;
	Scanner s;
	DayWork[] day;
	private int month;

	Month() {
		s = new Scanner(System.in);
		System.out.println("받은 용돈 : ");
		int h= s.nextInt();
		this.setHmoney(h);
		System.out.print("날짜 : ");
		int d = s.nextInt();

		day = new DayWork[d];
		for (int i = 0; i < day.length; i++) {
			System.out.println(i + 1 + "일");
			System.out.print("지출 내용 : ");
			String work = s.next();
			if (work.equals("없음")) {
				System.out.println("현재 남은 용돈 : " + hmoney);
			} else {
				System.out.print("지출 금액 : ");
				int money = s.nextInt();
				day[i] = new DayWork(work, money);
				hmoney -= money;
				if (hmoney >= 0) {
					System.out.println("현재 남은 용돈 : " + hmoney);
				} else {
					System.out.println("용돈을 초과했습니다.");
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
		System.out.print("일을 입력하세요 : ");
		int n = s.nextInt();
		System.out.println(n + "일은 ");
		day[n - 1].show();
	}

}