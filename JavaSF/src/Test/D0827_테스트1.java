package Test;

import java.util.Scanner;

public class D0827_�׽�Ʈ1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		����1��
//		int[] num = new int[20];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=i+1;
//			System.out.print(num[i]+" ");
//		}

//		����2��
//		int[] num = new int[30];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=3*i+3;
//			System.out.print(num[i]+" ");
//		}

//		����3��
//		int[] num = new int[45];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)((Math.random()*45)+1);
//			System.out.print(num[i]+" ");
//		}

//		����4��
//		double[] num = new double[20];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(Math.random()*10);
//			System.out.println(num[i]);
//		}

//		����5��
//		char[] num = new char[26];
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(char)('a'+i);
//			System.out.println(num[i]);
//		}

//		����6��
//		int[] num = new int[30];
//		int sum =0;
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)(Math.random()*70)+1;
//			System.out.println(num[i]);
//			sum+=num[i];
//		}
//		System.out.println("�� �� ���� : "+sum);

//		����7��
//		int[] num=new int[50];
//		int up = 0;
//		for (int i = 0; i < num.length; i++) {
//			num[i]=(int)(Math.random()*100)+1;
//			if (num[i]>=50) {
//				up++;
//			}
//		}
//		System.out.println("50�̻��� ���� : "+up);

//		����8��
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
//		System.out.println("30�� �̻��� ������ ����� : "+(sum/play));

//		����9��
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
//		System.out.println("�ִ밪�� : " + max);
//		System.out.println("�ּҰ��� : " + min);

//		����10��
//		int[] num = new int[5];
//		int cnt = 1;
//		while (cnt <= 5) {
//			System.out.print(cnt+ "��° ���� �Է� : ");
//			int num1 = s.nextInt();
//			if (num1 >= -20 && num1 <= 200) {
//				num[cnt-1] = num1;
//				cnt++;
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}

//		����11��
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

//		����12��
		int[] num = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int j = 0; j < 5; j++) {
			System.out.println(j + 1 + "��° ���� ����");

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
				System.out.println(k + 1 + "��° ���ڴ� " + lotto[k]);

			}

			System.out.println();
		}
	}

}
