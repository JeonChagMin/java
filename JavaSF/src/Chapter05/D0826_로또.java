package Chapter05;

import java.util.Scanner;

public class D0826_�ζ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		System.out.print("�迭 ���̸� �Է����ּ��� : ");
//		int len = s.nextInt();
//		int[] bae = new int[len];
//		
//		
//		
//		int max = 0;
//		for (int i = 0; i < len; i++) {
//			System.out.print(i+1+"��° ���� �Է� : ");
//			bae[i]=s.nextInt();
//		}
//		for (int i = 0; i < bae.length; i++) {
//			System.out.println(i+1+"��° ���� : "+bae[i]);
//		}

		int[] ar = new int[45];
		int[] lotto = new int[6];
		int[] tot = new int[45];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 1;
		}
		// 6�� ���� �ߺ����� ����
		// ar�迭�� index 2���� ����
		for (int j = 1; j <= 2000; j++) {
			for (int i = 1; i <= 2000; i++) {
				int st = (int) (Math.random() * ar.length);
				int ed = (int) (Math.random() * ar.length);

				int imsi = ar[st];
				ar[st] = ar[ed];
				ar[ed] = imsi;
			}

			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = ar[i];
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.println(lotto[i]);
			}
//			for (int i = 0; i < lotto.length; i++) {
//				tot[lotto[i] - 1]++;
//			}
//
//		}
//
//		for (int i = 0; i < tot.length; i++) {
//			System.out.print(i + 1 + "�� ���� : ");
//			for (int j = 0; j < tot[i] / 40; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		}
//		for(int i=0 ; i<lotto.length ; i++) {
//			System.out.println(i+1+"��° ���� : "+lotto[i]);
//		}

//		for(int i=0 ; i<ar.length ; i++) {
//			System.out.print(ar[i]+" ");
//		}
//		
//		for(int i=0 ; i<lotto.length ; i++) {
//			System.out.println(i+1+"��° ���� : "+lotto[i]);
//		}

//		���� ���� ���ϱ� 
//		int[] ar = new int[20];
//		int[] br = new int[5];
//		
//		for (int i = 0; i < ar.length; i++) {
//			int n = (int)(Math.random()*5+1);
//			ar[i]=n;
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			br[ar[i]-1]++;
//		}
//		
//		for (int i = 0; i < br.length; i++) {
//			System.out.println(i+1+"�� ���� : "+br[i]);
//		}

	}

}
