package Chapter08;

import java.util.Scanner;

public class D1007_��ü�迭���������� {

	public static void main(String[] args) {
		System.out.println("*** ���������� ���� ��ŸƮ ***");
		Scanner s = new Scanner(System.in);
		Child c = new Child();
		while (true) {
			if (c.win == c.num) {
				System.out.println("�ý��� ����");
				break;
			}
			System.out.println("���� ���� �� �� �ϳ� ����");
			System.out.print("������ 0, ������ 1, ���� 2�� �Է����ּ��� : ");
			int what = s.nextInt();
			c.setWork(what);
			c.play();
			if (c.lose == false) {
				System.out.println("�ý��� ����");
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
			rsp = "����";
		} else if (num == 1) {
			rsp = "����";
		} else {
			rsp = "��";
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
		System.out.print("���̵��� �Է��ϼ���( �̰ܾ��ϴ� �÷��̾� �� ) : ");
		num = s.nextInt();
		g = new Game[num];
		for (int i = 0; i < g.length; i++) {
			g[i] = new Game(i + 1 + "��° ���");
		}
	}

	void play() {
		if (work == 0 && g[win].getNum() == 2 || work == 1 && g[win].getNum() == 0
				|| work == 2 && g[win].getNum() == 1) {
			System.out.println("����� �� ���� : " + what);
			System.out.println("������ �� ���� : " + g[win].show());
			System.out.println(win + 1 + "��° ��뿡�� �̰���ϴ�.");
			win++;
		}

		else if (work == g[win].getNum()) {
			System.out.println("����� �� ���� : " + what);
			System.out.println("������ �� ���� : " + g[win].show());
			System.out.println(win + 1 + "��° ��뿡�� �����ϴ�.");
		}

		else {
			System.out.println("����� �� ���� : " + what);
			System.out.println("������ �� ���� : " + g[win].show());
			System.out.println(win + 1 + "��° ��뿡�� �����ϴ�.");
			lose = false;
		}
	}

	public int getWork() {
		return work;
	}

	public void setWork(int work) {
		if (work == 0) {
			what = "����";
		} else if (work == 1) {
			what = "����";
		} else if (work == 2) {
			what = "��";
		}
		this.work = work;
	}
}