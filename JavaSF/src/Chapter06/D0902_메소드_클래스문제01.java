package Chapter06;

import java.util.Scanner;

public class D0902_�޼ҵ�_Ŭ��������01 {

	public static void main(String[] args) {
new Abc().run();
	}

}

class Abc {
	void run() {
		Scanner s = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = s.next();
		System.out.print("���� ���� : ");
		int n = s.nextInt();
		String[] sub = new String[n];
		int[] score = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sub[i] = s.next();
			System.out.print(sub[i]+"�� ���� : ");
			score[i] = s.nextInt();
			sum+= score[i];
		}
		System.out.println(name+"�� ���� ���� : "+sum);
	}

}
