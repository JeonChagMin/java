package Chapter06;

import java.util.Scanner;

public class D0902_�޼ҵ�_��Ģ���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
//		int x0 = s.nextInt();
//		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
//		int x1 = s.nextInt();
//		System.out.print("����° ���ڸ� �Է����ּ��� : ");
//		int x2 = s.nextInt();
//		System.out.print("�׹�° ���ڸ� �Է����ּ��� : ");
//		int x3 = s.nextInt();
		System.out.print("�� ������ ���� : ");
		int play = s.nextInt();
		int[] num = new int[play];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1+"��° ���ڸ� �Է����ּ��� : ");
			num[i] = s.nextInt();
		}
		calc(num);

	}

	private static void calc(int[] num){
//		System.out.printf("%d�� %d�� ���� ���� : %d\n",x,y,x+y);
//		System.out.printf("%d�� %d�� �� ���� : %d\n",x,y,x-y);
//		System.out.printf("%d�� %d�� ���� ���� : %d\n",x,y,x*y);
//		System.out.printf("%d�� %d�� ���� ���� : %d\n",x,y,x/y);
//		�� ���� ���� �ƴ� ��� �迭�� �����ؾ��ϴµ� �迭�� �����ϴ� ���
//		�迭�� ���������̱� ������ �ּҰ��� �����ؾ��Ѵ�.
		int max = num[0]; 
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}else if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("�ִ� :"+max);
		System.out.println("�ּ� :"+min);
			
		
	}
	
	

}
