package Test;

import java.util.Scanner;

public class D0820_13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
      	int a = s.nextInt();
      	System.out.printf("10진수 : %d\n",a );
      	System.out.printf("8진수 : %o\n",a );
      	System.out.printf("16진수 : %x",a);
      	
      	
	}

}
