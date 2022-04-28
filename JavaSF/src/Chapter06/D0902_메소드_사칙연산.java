package Chapter06;

import java.util.Scanner;

public class D0902_메소드_사칙연산 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력해주세요 : ");
//		int x0 = s.nextInt();
//		System.out.print("두번째 숫자를 입력해주세요 : ");
//		int x1 = s.nextInt();
//		System.out.print("세번째 숫자를 입력해주세요 : ");
//		int x2 = s.nextInt();
//		System.out.print("네번째 숫자를 입력해주세요 : ");
//		int x3 = s.nextInt();
		System.out.print("총 숫자의 개수 : ");
		int play = s.nextInt();
		int[] num = new int[play];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1+"번째 숫자를 입력해주세요 : ");
			num[i] = s.nextInt();
		}
		calc(num);

	}

	private static void calc(int[] num){
//		System.out.printf("%d와 %d를 더한 값은 : %d\n",x,y,x+y);
//		System.out.printf("%d와 %d를 뺀 값은 : %d\n",x,y,x-y);
//		System.out.printf("%d와 %d를 곱한 값은 : %d\n",x,y,x*y);
//		System.out.printf("%d와 %d를 나눈 값은 : %d\n",x,y,x/y);
//		한 가지 값이 아닌 경우 배열을 리턴해야하는데 배열을 리턴하는 경우
//		배열은 참조변수이기 때문에 주소값을 리턴해야한다.
		int max = num[0]; 
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}else if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("최대 :"+max);
		System.out.println("최소 :"+min);
			
		
	}
	
	

}
