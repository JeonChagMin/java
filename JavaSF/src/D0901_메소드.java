import java.util.Scanner;

public class D0901_�޼ҵ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��� �� : ");
		int   dan = s.nextInt();
		gugudan(dan);
	}

	private static void gugudan(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

	private static int sum(int a, int b) {
		int s = a + b;
		return s;

	}

	private static void hi() {
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println("��");
	}
}
