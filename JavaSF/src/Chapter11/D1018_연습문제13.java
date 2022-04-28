package Chapter11;

import java.util.Scanner;

public class D1018_연습문제13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer result = new StringBuffer();

		int n[] = new int[26];
		for (int i = 0; i < n.length; i++) {
			n[i]=0;
		}
		
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		while (true) {
			String sen = s.nextLine();
			if (sen.charAt(0)==';') {
				break;
			}
			result.append(sen);
		}
		
		String word = result.toString().toUpperCase();
//		StringBuffer를 사용할려면 toString을 호출한 다음 메소드를 사용하면 된다.
		for (int i = 0; i < word.length(); i++) {
			char ABC = word.charAt(i);
				if (ABC >='A'&& ABC<='Z') {
					int index = (int)(ABC-'A');
					n[index]++;
				}

			}

		System.out.println();
		System.out.println("히스토그램을 그립니다");
		for (int i = 0; i < n.length; i++) {
			System.out.print((char)('A'+i));
			for (int j = 0; j < n[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
