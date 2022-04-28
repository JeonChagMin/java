package Chapter12;

import java.util.Scanner;

public class D1020_thread {

	public static void main(String[] args) {
//		3, 5 , 7
		Scanner s =new Scanner(System.in);
		System.out.print("숫자 하나를 입력해주세요 ");
		int x = s.nextInt();
		int num[] = new int[x];
		for (int i = 0; i < num.length; i++) {
		num[i]=i+1;	
		}
		
		Thread three = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i < num.length; i++) {
					if (num[i]%3==0) {
						sum+=num[i];
					}
				}
				System.out.println("3의 배수의 합은 : "+sum);
				
			}
		});
		
		three.start();
		
		Thread five = new Thread() {
			@Override
			public void run() {
				try {Thread.sleep(100);
					
				} catch (InterruptedException e) {
				}
				int sum = 0;
				for (int i = 0; i < num.length; i++) {
					if (num[i]%5==0) {
					sum+=num[i];
					}
				}
				System.out.println("5의 배수의 합은 : "+sum);
			}
		};
		five.start();
		
		
		int sum =0;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i]%7==0) {
				sum+=num[i];
			}
		}
		System.out.println("7의 배수의 합은 : "+sum);
		
		System.out.println(three.getName());
		System.out.println(five.getName());
	}
}

