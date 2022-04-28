package Chapter04;

import java.util.Scanner;

public class D0818_조건문문제모음 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		1번

//		for (int i = 65; i <= 90; i++) {
//			System.out.println((char)i+"  ");
//			
//		}

//		2번
//	
//		System.out.print("국어 점수를 입력하세요 : ");
//		int kor =s.nextInt();
//		System.out.print("영어 점수를 입력하세요 : ");
//		int eng=s.nextInt(); 
//		System.out.print("수학 점수를 입력하세요 : ");
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

//		3번
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
			
	


//		4번
//		System.out.print("구구단의 단을 입력하세요 : ");
//		int a = s.nextInt();
//		
//		for (int i = 9; i >=1; i--) {
//			System.out.println(a+" * " + i + " = " + (a*i));
//		
//		}
		
		
//		5번
//		System.out.print("첫 번째 수 : ");
//		int x =s.nextInt();
//		System.out.println("두 번째 수 : ");
//		int y =s.nextInt();
//		System.out.print("결과 : ");	
//		int max, min;
//		max = x>y ? x : y;
//		min = x>y ? y : x;
//		for(int i=min; i<=max ; i++)
//			System.out.println(i+" ");
		
		
//		6번
//		입력받은 수
//		시작, 종료
		System.out.print("입력 받은 수 : ");
		int n1 = s.nextInt();
		System.out.print("시작 : ");
		int x =s.nextInt();
		System.out.print("종료 : ");
		int y= s.nextInt();
		int max, min;
		max = x>y ? x : y;
		min = x>y ? y : x;
		for (int i = min; i <=max ; i++) {
			System.out.println(n1+" * "+i+" = "+(n1*i));
			
			
		}
		
	}
}
		


