package Test;

import java.util.Scanner;

public class D0830_테스트3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		문제14번

//		int[] num = new int[30];
//		int[] rank = new int[30];
//
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int) (Math.random() * 1000) + 1;
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < num.length; i++) {
//			rank[i] = 1;
//			for (int j = 0; j < num.length; j++) {
//				if (num[j] > num[i]) {
//					rank[i]++;
//				}
//			}
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < rank.length; j++) {
//				if (rank[j] == i) {
//					System.out.println(i + "등 데이터 값 : " + num[j] + ", 위치값 : " + j);
//				}
//			}
//		}

//		문제15번

		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 300) + 1;
		}
		System.out.println("***입력 데이터***");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("***오름차순 정렬 데이터***");
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("***내림차순 정렬 데이터***");
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int imsi1 = num[i];
					num[i] = num[j];
					num[j] = imsi1;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
