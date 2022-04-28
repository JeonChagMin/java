import java.util.Scanner;

public class D0903_사다리타기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("몇 조 : ");
		int num = s.nextInt();
		int[] jo = new int[num];
		for (int i = 0; i < jo.length; i++) {
			jo[i]=i+1;
		}
		
		for (int i = 0; i < 200; i++) {
			int st = (int)(Math.random()*num);
			int ed = (int)(Math.random()*num);
			int imsi = jo[st];
			jo[st]=jo[ed];
			jo[ed]=imsi;
		}
		if (jo[0]!=3) {
			System.out.println(jo[0]);
		} else if(jo[0]==3) {
			System.out.println(jo[1]);
		}
	}

}
