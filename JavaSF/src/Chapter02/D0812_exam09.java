package Chapter02;

public class D0812_exam09 {

	public static void main(String[] args) {

		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자로군요");
		}

		if ((charCode >= 97) && (charCode <= 90)) {
			System.out.println("소문자로군요");
		}

		if (!(charCode < 48) && !(charCode > 57)) // (charCode>=48 && charCode <=57){
			System.out.println("0~9 숫자군요");

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}

		/*
		 * 대문자로군요 2 또는 3의 배수군요 2 또는 3의 배수군요
		 */
	}

}
