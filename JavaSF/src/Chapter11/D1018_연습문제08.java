package Chapter11;

import java.util.Scanner;

public class D1018_연습문제08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print(">> ");
		StringBuffer sb = new StringBuffer(s.nextLine());
		while (true) {

			try {
				System.out.print("명령 : ");
				String word = s.next();
				if (word.equals("그만")) {
					System.out.print("종료합니다");
					break;
				}
				String a[] = word.split("!");
				sb.replace(sb.indexOf(a[0]), sb.indexOf(a[0])+a[0].length(), a[1]);
				System.out.println(sb);
			} catch (Exception e) {
				System.out.println("찾을 수 없습니다!");
			}
			
		}

	}

}
