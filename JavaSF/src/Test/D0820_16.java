package Test;

import java.util.Scanner;

public class D0820_16 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է� :");
		String a = s.nextLine();
		char b = a.charAt(0);
		
		if (b>='a'&&b<='z') {
			System.out.println("�빮��");
			
		}else {
			System.out.println("�ҹ���");
		}
	}

}