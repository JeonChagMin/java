package Chapter04;

public class D0819_문제02 {

	public static void main(String[] args) {

		int num = 0, even = 0, odd = 0, x = 0;

		for (int i = 1; i <= 1000; i++) {
//		num=(int)(Math.random()*100)+1;
//		System.out.print(num+" ");
//		if (num%2==0) {
//			even++;
//		} else {
//			odd++;
//			
//			
//		}
//		}
//		System.out.println("\n짝수의 개수는 : "+even);
//		System.out.println("홀수의 개수는 : "+odd);
//		if (num%4==0)
//			even++;
			if (i % 6 == 0 && i % 4 == 0) {
				x++;
				System.out.print(i + " ");
			}
		}
//		System.out.println("\n4의 배수의 개수는 : "+even);
		System.out.println("\n4와 6의 공배수의 개수는 : " + x);

	}

}
