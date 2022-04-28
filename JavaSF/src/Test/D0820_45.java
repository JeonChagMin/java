package Test;

import java.util.Scanner;

public class D0820_45 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int y = (int) (Math.random() * 100 + 1);
		System.out.println("***1~100상의 숫자 맞추는 게임***");
		System.out.println(y);
		boolean c = true;
		int con = 0;
		while (c) {
			System.out.println("숫자를 입력하세요 : ");
			int x = s.nextInt();
			if (x > y) {
				System.out.println("틀렸습니다. 더 작은 수 입니다.");
				con++;
			} else if (x < y) {
				System.out.println("틀렸습니다. 더 큰 수 입니다.");
				con++;
			} else if (y == x) {
				System.out.println("정답입니다.");
				con++;

				c = false;
			}
		}
		System.out.println("총 실행 횟수는 : " + con);
	}
}

//		먼저 1~100사이 랜덤값을 하나 구한 뒤 스캐너로 내가 입력한 값이 그 수랑 같은 경우 정답으로 출력을 하고 아니면 다시 돌아가는 방법
