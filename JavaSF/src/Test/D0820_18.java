package Test;

import java.util.Scanner;

public class D0820_18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է����ּ��� : ");
		String x=s.nextLine();
		char a = x.charAt(7);
		if (a=='1') {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�");
		}
	}

}
