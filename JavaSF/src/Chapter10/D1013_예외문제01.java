package Chapter10;

public class D1013_���ܹ���01 {

	public static void main(String[] args) {
		String[] ar = { "123", "345", "56.7", "789" };
		for (int i = 0; i < ar.length; i++) {
			int num = 0;
			try {
				num = Integer.parseInt(ar[i]);
			} catch (NumberFormatException e) {
				System.out.println(ar[i] + "�� ������ �ƴմϴ�.");
			}
			if (num != 0) {
				System.out.println(i + 1 + "��°������: " + num);
			}
		}
	}
}
