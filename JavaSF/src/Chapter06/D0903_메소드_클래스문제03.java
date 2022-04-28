package Chapter06;

import java.util.Scanner;

public class D0903_메소드_클래스문제03 {

	public static void main(String[] args) {
		new Cd().input();
	}
//	1 2 3 4 5
}

class Cd{
	void input() {
		Scanner scanner = new Scanner(System.in);
		int s = 0;
		System.out.print("숫자를 입력하세요 : ");
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
		System.out.println("홀수들의 총 합은 : "+s+"입니다.");
			
//		홀수의 합
	}
	void even(int[] ar, int s) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				s+=ar[i];
			}
		}
		System.out.printf("짝수들의 총 합은 : %d입니다.",s);
//		짝수의 합
	}
}
