package Test;

import java.util.Scanner;

public class D0820_17 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		
		System.out.print("���� �Է����ּ��� : ");
		int a = s.nextInt();
		if (a>=3 && a<=5) {
			System.out.println("��");
		}
		else if (a>=6 && a<=8) {
			System.out.println("����");
		}else if (a>=9 && a<=11) {
			System.out.println("����");
		}else {
			System.out.println("�ܿ�");
		}
		
		
		int x=(int)(Math.random()*3+1);
		int y=(int)(Math.random()*3+1);
		System.out.println("��ǻ�� :"+x+"  ���� : "+y);
		if (x==y) {
			System.out.println("���º�");
		}else if (x>y) {
			System.out.println("��ǻ�� ��");
		}else {
			System.out.println("���� ��");
		}
			
			
		
			

		
	}

}
