package Chapter05;

import java.util.Scanner;

public class D0831_2차원배열 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.print("행 : ");
//		int x = s.nextInt();
//		System.out.print("열 : ");
//		int y = s.nextInt();
		int[][] ar = new int[5][5];
		int num = 1;

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar.length; j++) {
//				ar[i][j] = 0;
//			}
//			for (int j = i; j < ar[i].length; j++) {
//				ar[i][j] = num++;
//			}
//			for (int j = 0; j < ar[i].length; j++) {
//				System.out.printf("%4d   ",ar[i][j]);
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar.length; j++) {
//				ar[i][j] = 0;
//			}
//			for (int j = 0; j < ar.length-i; j++) {
//				ar[i][j] = num++;
//			}
//			for (int j = 0; j < ar.length; j++) {
//				System.out.printf("%4d   ",ar[i][j]);
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				ar[i][j] = 0;
//			}
//			for (int j = 0; j < i + 1; j++) {
//				ar[i][j] = num++;
//			}
//			for (int j = 0; j < ar[i].length; j++) {
//				System.out.printf("%4d   ",ar[i][j]);
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 0;
			}
			for (int j = ar[i].length-1-i; j < ar[i].length; j++) {
				ar[i][j] = num++;
			}
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%4d   ",ar[i][j]);
			}
			System.out.println();
		}

	}
}
