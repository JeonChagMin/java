package Chapter04;

import java.util.Scanner;

public class D0818_���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�ƹ��ų� �Է��ϼ��� : ");
//		String str ="13345";
		String str = s.next();
		boolean isNum = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
//			���ڿ��� ������ ��ġ�� ���� index�� �ִ�.
			if (!(ch >= '0' && ch <= '9')) {
				isNum = false;
			}
		}
		if (isNum) {
			System.out.println("����");

//			if (isNum) {
//				int sum=0;
//				for (int j = 0; j < str.length(); j++) {
//					char ch1=str.charAt(j);
//					sum=sum+(ch-'0');
//					}
//				System.out.println(str +"�� �հ� : "+sum);
		} else {
			System.out.println("���ڰ� �ƴ�");

		}

//		6.
//		for (int i = 1; i <= 6; i++) {
////			System.out.println("ù��° : "+i);
//			for (int j = 1; j <= 6; j++) {
////				System.out.println("�ι�° : "+j);
//				if (i + j == 6) {
//					System.out.println(i + " �� " + j);
//				}
//			}
//
//		}

//		7.
//		2x+4y=10�� ��� �ظ� ���ϼ���, x�� y�� ��� �����̰� ������ 0 ~ 10�̴�.
//		for (int x = 0; x <=10; x++) {
//			for (int y = 0; y <11; y++) {
//				if (2*x+4*y==10) {
//					System.out.println("x�� ���� "+x+"�̰�, y�� ���� : "+y+"�Դϴ�");
//				}
//				
//			}
//			
//		}

	}

}
