package Chapter11;

import java.util.Scanner;

public class D1019_���ܹ��� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word="";
		while (true) {
	    System.out.print("������ �Է��ϼ��� : ");
	    String word1= s.nextLine();
	    word+=word1+" ";
		if (word1.equals("��")) {
			System.out.println("����");
			break;
		}
		
		}
		String result[] = word.split(" ");
		System.out.println("������ ������ : "+(result.length-1));

	}

}
