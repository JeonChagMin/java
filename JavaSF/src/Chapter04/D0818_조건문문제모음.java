package Chapter04;

import java.util.Scanner;

public class D0818_���ǹ��������� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		1��

//		for (int i = 65; i <= 90; i++) {
//			System.out.println((char)i+"  ");
//			
//		}

//		2��
//	
//		System.out.print("���� ������ �Է��ϼ��� : ");
//		int kor =s.nextInt();
//		System.out.print("���� ������ �Է��ϼ��� : ");
//		int eng=s.nextInt(); 
//		System.out.print("���� ������ �Է��ϼ��� : ");
//		int mat=s.nextInt();
//		int ave = (kor+eng+mat)/30;
//		System.out.println(ave);
//		switch (ave) {
//		
//		case 10:
//			System.out.println("A");
//			break;
//			
//		case 9:
//			System.out.println("A");
//			break;
//			
//		case 8:
//			System.out.println("B");
//		    break;
//		    
//		case 7:
//			System.out.println("C");
//		    break;
//		    
//		case 6:
//			System.out.println("D");
//		    break;
//		    
//		default:
//			System.out.println("F");
//			break;
//		}

//		3��
//		int play = 0;
//		for (int i = 1; i <= 50; i++) {
//			System.out.print(i + "  ");
//			play++;
//			if (play%8==0) {
//				System.out.println();
//			}
//		}
//	}

//			} else if (play == 16) {
//				System.out.println();
//			} else if (play == 24) {
//				System.out.println();
//			} else if (play == 32) {
//				System.out.println();
//			} else if (play == 40) {
//				System.out.println();
//			} else if (play == 48) {
//				System.out.println();
//			}
			
	


//		4��
//		System.out.print("�������� ���� �Է��ϼ��� : ");
//		int a = s.nextInt();
//		
//		for (int i = 9; i >=1; i--) {
//			System.out.println(a+" * " + i + " = " + (a*i));
//		
//		}
		
		
//		5��
//		System.out.print("ù ��° �� : ");
//		int x =s.nextInt();
//		System.out.println("�� ��° �� : ");
//		int y =s.nextInt();
//		System.out.print("��� : ");	
//		int max, min;
//		max = x>y ? x : y;
//		min = x>y ? y : x;
//		for(int i=min; i<=max ; i++)
//			System.out.println(i+" ");
		
		
//		6��
//		�Է¹��� ��
//		����, ����
		System.out.print("�Է� ���� �� : ");
		int n1 = s.nextInt();
		System.out.print("���� : ");
		int x =s.nextInt();
		System.out.print("���� : ");
		int y= s.nextInt();
		int max, min;
		max = x>y ? x : y;
		min = x>y ? y : x;
		for (int i = min; i <=max ; i++) {
			System.out.println(n1+" * "+i+" = "+(n1*i));
			
			
		}
		
	}
}
		


