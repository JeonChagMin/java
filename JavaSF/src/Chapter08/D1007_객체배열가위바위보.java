package Chapter08;

import java.util.Scanner;

public class D1007_객체배열가위바위보 {

	public static void main(String[] args) {
		System.out.println("*** 가위바위보 게임 스타트 ***");
		Scanner s = new Scanner(System.in);
		Child c = new Child();
		while (true) {
			if (c.win == c.num) {
				System.out.println("시스템 종료");
				break;
			}
			System.out.println("가위 바위 보 중 하나 선택");
			System.out.print("가위면 0, 바위면 1, 보면 2를 입력해주세요 : ");
			int what = s.nextInt();
			c.setWork(what);
			c.play();
			if (c.lose == false) {
				System.out.println("시스템 종료");
				break;
			}
		}

	}

}

class Game {
	private String name;
	private String rsp;
	private int num;

	Game() {
	}

	Game(String n) {
		name = n;
		num = (int) (Math.random() * 3);
		if (num == 0) {
			rsp = "가위";
		} else if (num == 1) {
			rsp = "바위";
		} else {
			rsp = "보";
		}
	}

	String show() {
		return rsp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

class Child extends Game {
	Game[] g;
	Scanner s = new Scanner(System.in);
	int work;
	int num;
	int win = 0;
	String what;
	boolean lose = true;

	Child() {
		System.out.print("난이도를 입력하세요( 이겨야하는 플레이어 수 ) : ");
		num = s.nextInt();
		g = new Game[num];
		for (int i = 0; i < g.length; i++) {
			g[i] = new Game(i + 1 + "번째 상대");
		}
	}

	void play() {
		if (work == 0 && g[win].getNum() == 2 || work == 1 && g[win].getNum() == 0
				|| work == 2 && g[win].getNum() == 1) {
			System.out.println("당신이 낸 것은 : " + what);
			System.out.println("상대방이 낸 것은 : " + g[win].show());
			System.out.println(win + 1 + "번째 상대에게 이겼습니다.");
			win++;
		}

		else if (work == g[win].getNum()) {
			System.out.println("당신이 낸 것은 : " + what);
			System.out.println("상대방이 낸 것은 : " + g[win].show());
			System.out.println(win + 1 + "번째 상대에게 비겼습니다.");
		}

		else {
			System.out.println("당신이 낸 것은 : " + what);
			System.out.println("상대방이 낸 것은 : " + g[win].show());
			System.out.println(win + 1 + "번째 상대에게 졌습니다.");
			lose = false;
		}
	}

	public int getWork() {
		return work;
	}

	public void setWork(int work) {
		if (work == 0) {
			what = "가위";
		} else if (work == 1) {
			what = "바위";
		} else if (work == 2) {
			what = "보";
		}
		this.work = work;
	}
}