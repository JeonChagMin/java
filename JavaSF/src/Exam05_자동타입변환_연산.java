
public class Exam05_�ڵ�Ÿ�Ժ�ȯ_���� {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
//		byte ���� ������ �ϸ� int �� �ڵ���ȯ�Ǳ� ������ ���� ���� int �� �ٲ���Ѵ�.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue1+charValue2;
//		charValue1�� A�� �ڵ�ȭ�� ���� ���ڷ� �ٲ� ���� ���� int �� �ٲ��.
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2);
		System.out.println("��¹���=" + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
//		int intValue5=10/4.0;
//		4.0�� int �� �ƴ϶� double �̱� ������ ���� ���� double �� �Է��ؾ��Ѵ�.
		double doubleValue = 10 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
//		double �� ���� �ʾ����� 0.5�� �ƴ϶� 0�� ������ ���´�.

	}

}
