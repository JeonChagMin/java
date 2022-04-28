package Chapter04;

import java.util.Scanner;

public class D0819_마무리 {

	public static void main(String[] args) {

//		문제 2
//		int sum =0;
//		for (int i = 1; i <=100; i++) {
//			if(i%3==0) {
//			sum +=i;
//			
//			}
//		}
//		System.out.println(sum);

		
//		문제 3
//		while (true) {
//			int x = (int)(Math.random()*6+1);
//			int y = (int)(Math.random()*6+1);
//			System.out.print("눈1 : "+x+"  ");
//			System.out.println("눈2 : "+y);
//			if (x+y==5) {
//				System.out.println("눈의 합이 5가 되는 수 : " + x + ", " + y+"\n종료");
//				break;
//			}
//		}

		
//		문제4
//
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if ((4*x)+(5*y)==60) {
//					System.out.println("x의 값은 : " +x+", y의 값은 : " +y);
//					
//				}
//
//			}
//		}
		
		
//		문제7
		
		Scanner s =new Scanner(System.in);
		boolean run= true;
		int balance = 0;
		
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			String x=s.nextLine();
//			int num=Integer.parseInt(x);
//			if (x.equals("1")) {
//				System.out.print("예금액 > ");
//				balance+=Integer.parseInt(s.nextLine());
//				System.out.println();
//			}else if (x.equals("2")) {
//				System.out.print("출금액 > ");
//				balance-=Integer.parseInt(s.nextLine());
//				System.out.println();
//			}else if (x.equals("3")) {
//				System.out.print("잔고 > ");
//				System.out.println(balance);
//				System.out.println();
//			}else if (x.equals("4")) {
//				System.out.println("프로그램 종료");
//			break;
//			} 	
			
			switch (x) {
			case "1": 
				System.out.print("예금액 > ");
				balance+=Integer.parseInt(s.nextLine());
				break;
			case "2":
				System.out.print("출금액 > ");
				balance-=Integer.parseInt(s.nextLine());
				break;
			case "3":
				System.out.print("잔소 > ");
				System.out.println(balance);
				break;
			default :
				System.out.print("프로그램 종료");
				run=false;
				break;
			} 
		}
	}
}
