package Test;

import java.util.Scanner;

public class D0820_17 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 : ");
		int a = s.nextInt();
		if (a>=3 && a<=5) {
			System.out.println("봄");
		}
		else if (a>=6 && a<=8) {
			System.out.println("여름");
		}else if (a>=9 && a<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		int x=(int)(Math.random()*3+1);
		int y=(int)(Math.random()*3+1);
		System.out.println("컴퓨터 :"+x+"  유저 : "+y);
		if (x==y) {
			System.out.println("무승부");
		}else if (x>y) {
			System.out.println("컴퓨터 승");
		}else {
			System.out.println("유저 승");
		}
			
			
		
			

		
	}

}
