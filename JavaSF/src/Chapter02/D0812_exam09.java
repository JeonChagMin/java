package Chapter02;

public class D0812_exam09 {

	public static void main(String[] args) {

		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�ڷα���");
		}

		if ((charCode >= 97) && (charCode <= 90)) {
			System.out.println("�ҹ��ڷα���");
		}

		if (!(charCode < 48) && !(charCode > 57)) // (charCode>=48 && charCode <=57){
			System.out.println("0~9 ���ڱ���");

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}

		/*
		 * �빮�ڷα��� 2 �Ǵ� 3�� ������� 2 �Ǵ� 3�� �������
		 */
	}

}
