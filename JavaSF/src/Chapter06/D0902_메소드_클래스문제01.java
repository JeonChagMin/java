package Chapter06;

import java.util.Scanner;

public class D0902_메소드_클래스문제01 {

	public static void main(String[] args) {
new Abc().run();
	}

}

class Abc {
	void run() {
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = s.next();
		System.out.print("과목 종류 : ");
		int n = s.nextInt();
		String[] sub = new String[n];
		int[] score = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sub[i] = s.next();
			System.out.print(sub[i]+"의 점수 : ");
			score[i] = s.nextInt();
			sum+= score[i];
		}
		System.out.println(name+"의 점수 총합 : "+sum);
	}

}
