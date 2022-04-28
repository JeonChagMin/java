package Chapter08;

import java.util.Scanner;

public class D1007_객체배열달리기 {

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
		System.out.println(name+"선수의 기록은 : "+result+"입니다.");
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
		System.out.print("참가 인원을 입력하세요 : ");
		num = s.nextInt();
		m = new MaratonPlayer[num];
		for (int i = 0; i < m.length; i++) {
			System.out.print(i + 1 + "번째 주자의 이름 : ");
			name = s.next();
			System.out.println(i + 1 + "번째 주자의 기록 : ");
			result = s.nextDouble();
			m[i] = new MaratonPlayer(name, result);
		}

	}

	@Override
	void show() {
		System.out.println("찾고 싶은 주자 라인 : ");
		number = s.nextInt();
		m[number-1].show();
	}

}
