package Chapter04;

import java.util.Scanner;

public class D0819_������ {

	public static void main(String[] args) {

//		���� 2
//		int sum =0;
//		for (int i = 1; i <=100; i++) {
//			if(i%3==0) {
//			sum +=i;
//			
//			}
//		}
//		System.out.println(sum);

		
//		���� 3
//		while (true) {
//			int x = (int)(Math.random()*6+1);
//			int y = (int)(Math.random()*6+1);
//			System.out.print("��1 : "+x+"  ");
//			System.out.println("��2 : "+y);
//			if (x+y==5) {
//				System.out.println("���� ���� 5�� �Ǵ� �� : " + x + ", " + y+"\n����");
//				break;
//			}
//		}

		
//		����4
//
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if ((4*x)+(5*y)==60) {
//					System.out.println("x�� ���� : " +x+", y�� ���� : " +y);
//					
//				}
//
//			}
//		}
		
		
//		����7
		
		Scanner s =new Scanner(System.in);
		boolean run= true;
		int balance = 0;
		
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����> ");
			
			String x=s.nextLine();
//			int num=Integer.parseInt(x);
//			if (x.equals("1")) {
//				System.out.print("���ݾ� > ");
//				balance+=Integer.parseInt(s.nextLine());
//				System.out.println();
//			}else if (x.equals("2")) {
//				System.out.print("��ݾ� > ");
//				balance-=Integer.parseInt(s.nextLine());
//				System.out.println();
//			}else if (x.equals("3")) {
//				System.out.print("�ܰ� > ");
//				System.out.println(balance);
//				System.out.println();
//			}else if (x.equals("4")) {
//				System.out.println("���α׷� ����");
//			break;
//			} 	
			
			switch (x) {
			case "1": 
				System.out.print("���ݾ� > ");
				balance+=Integer.parseInt(s.nextLine());
				break;
			case "2":
				System.out.print("��ݾ� > ");
				balance-=Integer.parseInt(s.nextLine());
				break;
			case "3":
				System.out.print("�ܼ� > ");
				System.out.println(balance);
				break;
			default :
				System.out.print("���α׷� ����");
				run=false;
				break;
			} 
		}
	}
}
