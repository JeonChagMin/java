package Chapter11;

import java.util.Scanner;

public class D1019_간단문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word="";
		while (true) {
	    System.out.print("문장을 입력하세요 : ");
	    String word1= s.nextLine();
	    word+=word1+" ";
		if (word1.equals("끝")) {
			System.out.println("종료");
			break;
		}
		
		}
		String result[] = word.split(" ");
		System.out.println("어절의 개수는 : "+(result.length-1));

	}

}
