package Test;

public class D0820_26 {

	public static void main(String[] args) {

		int sum=0;
		for (int i = 1; i <= 200; i++) {
			if (i%5==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
