package Chapter08;

import java.util.Scanner;

public class D1007_��ü�迭�޸��� {

	public static void main(String[] args) {
		Maraton m = new Maraton();
		m.show();

	}

}

class MaratonPlayer {
	private String name;
	private double result;

	MaratonPlayer() {
	}

	MaratonPlayer(String n, double r) {
		name = n;
		result = r;
	}

	void show() {
		System.out.println(name+"������ ����� : "+result+"�Դϴ�.");
	}
}

class Maraton extends MaratonPlayer {
	MaratonPlayer[] m;
	Scanner s=new Scanner(System.in);
	int num;
	String name;
	double result;
	int number;

	Maraton() {
		System.out.print("���� �ο��� �Է��ϼ��� : ");
		num = s.nextInt();
		m = new MaratonPlayer[num];
		for (int i = 0; i < m.length; i++) {
			System.out.print(i + 1 + "��° ������ �̸� : ");
			name = s.next();
			System.out.println(i + 1 + "��° ������ ��� : ");
			result = s.nextDouble();
			m[i] = new MaratonPlayer(name, result);
		}

	}

	@Override
	void show() {
		System.out.println("ã�� ���� ���� ���� : ");
		number = s.nextInt();
		m[number-1].show();
	}

}
