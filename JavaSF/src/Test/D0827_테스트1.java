package Test;

import java.util.Scanner;

public class D0827_테스트1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		문제1번
//		int[] num = new int[20];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=i+1;
//			System.out.print(num[i]+" ");
//		}

//		문제2번
//		int[] num = new int[30];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=3*i+3;
//			System.out.print(num[i]+" ");
//		}

//		문제3번
//		int[] num = new int[45];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)((Math.random()*45)+1);
//			System.out.print(num[i]+" ");
//		}

//		문제4번
//		double[] num = new double[20];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(Math.random()*10);
//			System.out.println(num[i]);
//		}

//		문제5번
//		char[] num = new char[26];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(char)('a'+i);
//			System.out.println(num[i]);
//		}

//		문제6번
//		int[] num = new int[30];
//		int sum =0;
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)(Math.random()*70)+1;
//			System.out.println(num[i]);
//			sum+=num[i];
//		}
//		System.out.println("더 한 값은 : "+sum);

//		문제7번
//		int[] num=new int[50];
//		int up = 0;
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)(Math.random()*100)+1;
//			if (num[i]>=50) {
//				up++;
//			}
//		}
//		System.out.println("50이상의 개수 : "+up);

//		문제8번
//		int[] num=new int[100];
//		int sum = 0;
//		int play = 0;
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)((Math.random()*50)+1);
//			if (num[i]>=30) {
//				sum+=num[i];
//				play++;
//			}
//		}
//		System.out.println("30개 이상의 값들의 평균은 : "+(sum/play));

//		문제9번
//		int[] num = new int[60];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random() * 200) + 1;
//		}
//		int max = num[0];
//		int min = num[0];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//			if (num[i] >= max) {
//				max = num[i];
//			}
//			if (num[i]<=min) {
//				min = num[i];
//			}
//		}
//		System.out.println("최대값은 : " + max);
//		System.out.println("최소값은 : " + min);

//		문제10번
//		int[] num = new int[5];
//		int cnt = 1;
//		while (cnt <= 5) {
//			System.out.print(cnt+ "번째 숫자 입력 : ");
//			int num1 = s.nextInt();
//			if (num1 >= -20 && num1 <= 200) {
//				num[cnt-1] = num1;
//				cnt++;
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}

//		문제11번
//		int[] num = new int[30];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)((Math.random()*30)+1);
//		}
//		for (int i = 0; i < 500; i++) {
//			int st = (int)(Math.random()*num.length);
//			int ed = (int)(Math.random()*num.length);
//			int imsi = num[st];
//			num[st]=num[ed];
//			num[ed]=imsi;
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

//		문제12번
		int[] num = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int j = 0; j < 5; j++) {
			System.out.println(j + 1 + "번째 게임 시작");

			for (int i = 1; i <= 500; i++) {
				int st = (int) (Math.random() * num.length);
				int ed = (int) (Math.random() * num.length);
				int imsi = num[st];
				num[st] = num[ed];
				num[ed] = imsi;
			}
			for (int i1 = 0; i1 < lotto.length; i1++) {
				lotto[i1] = num[i1];
			}
			for (int k = 0; k < lotto.length; k++) {
				System.out.println(k + 1 + "번째 숫자는 " + lotto[k]);

			}

			System.out.println();
		}
	}

}
