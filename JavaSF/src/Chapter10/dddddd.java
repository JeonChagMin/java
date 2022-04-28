package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dddddd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		while (true) {
			if (x==0) {
				
			try {
				System.out.print("숫자1 입력 : ");
				x = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수로 입력바랍니다");
				s.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
				s.nextLine();
			}
			
			}
			if (x!=0) {
				
			try {
				System.out.print("숫자2 입력 : ");
				y = s.nextInt();
				System.out.println(x + " / " + y + " = " + x / y);
				break;

			} catch (InputMismatchException e) {
				System.out.println("정수로 입력바랍니다");
				s.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
				s.nextLine();
			}
			}
		}

	}

}
