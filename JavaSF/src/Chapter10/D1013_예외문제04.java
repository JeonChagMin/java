package Chapter10;

import java.util.Scanner;

public class D1013_예외문제04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int play = 0;
		int result = (int) (Math.random() * 100) + 1;
		System.out.println("정답 "+result);
		while (true) {
			int num =0;
			try {
				System.out.print("1과 100사이의 값을 입력하세요 : ");
				num = s.nextInt();

			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요");
				s.next();
			}

			play++;
			if (num!=0) {
				
			if (result>num) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if (result<num) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
			if (result==num) {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는 "+play+"번입니다.");
				break;
			}
			}
		}

	}

}
