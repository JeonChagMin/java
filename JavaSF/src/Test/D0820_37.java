package Test;

import java.util.Scanner;

public class D0820_37 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�Է� : ");
		String str = s.next();
		boolean c = true;
		for (int i = 0; i < str.length(); i++) {
//	    length �� �޼ҵ��̱� ������ ��ȣ�� �־���Ѵ�.
			char b = str.charAt(i);
			if (b >= '0' && b <= '9') {
				c = true;
			} else {
				c = false;
			}
		}
		if (c) {
			System.out.println("����");
		} else {
			System.out.println("���ھƴ�");
		}
	}

}
