package Chapter06;

public class D0902_메소드_배열 {

	public static void main(String[] args) {

		int[] ar = new int[30];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=(int)(Math.random()*100)+1;
		}
		calc(ar);
	}

	private static void calc(int[] ar) {
		int sum =0;
		int cnt =0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>=50) {
				sum+=ar[i];
				cnt++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
	
		
		
		}
		System.out.println();
		System.out.println("50이상의 수의 합 : "+sum);
		System.out.println("50이상의 수의 개수 : "+cnt);
		System.out.println("50이상의 수의 평균 : "+sum/cnt);
		
	}

}
