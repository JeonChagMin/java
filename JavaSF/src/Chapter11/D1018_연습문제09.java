package Chapter11;

import java.util.Scanner;

public class D1018_��������09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ, ����, �ѱ� ��� �˴ϴ�.");
		String word = s.nextLine();
		System.out.println(word);
		for (int i = 0; i < word.length(); i++) {
			String start = word.substring(0,1);
			String end = word.substring(1);
			word = end+start;
			System.out.println(word);
//		����.subString( ó������ �κ�, ������ INDEX ) ���ڿ����� ���ϴ� ���ڸ� ��� ������ �� �ִ�.	
			
		}
		
	}

}
