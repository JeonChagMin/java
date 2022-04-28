package Chapter11;

import java.util.Scanner;

public class D1018_연습문제09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸, 영어, 한글 모두 됩니다.");
		String word = s.nextLine();
		System.out.println(word);
		for (int i = 0; i < word.length(); i++) {
			String start = word.substring(0,1);
			String end = word.substring(1);
			word = end+start;
			System.out.println(word);
//		변수.subString( 처음시작 부분, 끝내는 INDEX ) 문자열에서 원하는 문자를 골라서 저장할 수 있다.	
			
		}
		
	}

}
