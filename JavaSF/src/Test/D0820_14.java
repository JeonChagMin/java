package Test;

import java.util.Scanner;

public class D0820_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է� :");
		String a = s.nextLine();
		char b = a.charAt(0);
		
		if (b>='0'&&b<='9') {
			System.out.println("����");
			
		}else {
			System.out.println("���ھƴ�");
		}
	}

}
