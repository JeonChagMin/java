package Chapter06;

import java.util.Scanner;

public class D0903_�޼ҵ�_Ŭ��������03 {

	public static void main(String[] args) {
		new Cd().input();
	}
//	1 2 3 4 5
}

class Cd{
	void input() {
		Scanner scanner = new Scanner(System.in);
		int s = 0;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n = scanner.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=i+1;
		}
		odd(ar, s);
		even(ar, s);
	}
	void odd(int[] ar, int s) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2!=0) {
				s+=ar[i];
			}
		}
		System.out.println("Ȧ������ �� ���� : "+s+"�Դϴ�.");
			
//		Ȧ���� ��
	}
	void even(int[] ar, int s) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				s+=ar[i];
			}
		}
		System.out.printf("¦������ �� ���� : %d�Դϴ�.",s);
//		¦���� ��
	}
}
