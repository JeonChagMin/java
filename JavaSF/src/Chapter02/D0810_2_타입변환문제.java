package Chapter02;

public class D0810_2_Ÿ�Ժ�ȯ���� {

	public static void main(String[] args) {

//		1. num�� ���� �Ʒ��� ���� �� ������ �����̴�.
//		int num = 456;
//		System.out.print(num / 100 * 100);

//		2. ���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲٴ��ڵ��̴�.
//		int num = 777;
//		System.out.println(num / 10 * 10 + 1);

//		3. �Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
//		c=30
//		ch=C
//		f=1.5
//		L=27000000000
//		result=true
		
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = (float) 3 / 2;
		long l = 3000l * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
//		float �� double �� ���������ÿ� ��Ÿ���� ���ϴ� ���� ���� �� �ֱ� ������ ������ ������� ������
//		�� ū ���� double �� ���� �� float �� �ٲ�� ������ ���ϼ� �ִ�. 
//		*ĳ������ ū�� �����ɷ� �������� �� ����Ѵ�.*
//		ex) float = 0.10000f, double 0.100001 �̶�� double �� float ���� �ٲ�� ������ ���� �� �ִ�.
		boolean result = (float) d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		
	}

}
