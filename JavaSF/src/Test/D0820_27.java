package Test;

public class D0820_27 {

	public static void main(String[] args) {

		int sum =0, play =0; 
		for (int i = 1; i <=200; i++) {
			if (i%3==0) {
				sum+=i;
				play++;
			}
		}
		 float ave=(float)sum/play;
		System.out.printf("%-10.2f",ave);
	}

}
