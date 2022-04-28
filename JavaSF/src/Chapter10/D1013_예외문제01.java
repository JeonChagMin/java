package Chapter10;

public class D1013_예외문제01 {

	public static void main(String[] args) {
		String[] ar = { "123", "345", "56.7", "789" };
		for (int i = 0; i < ar.length; i++) {
			int num = 0;
			try {
				num = Integer.parseInt(ar[i]);
			} catch (NumberFormatException e) {
				System.out.println(ar[i] + "은 정수가 아닙니다.");
			}
			if (num != 0) {
				System.out.println(i + 1 + "번째정수값: " + num);
			}
		}
	}
}
