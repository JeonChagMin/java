package Chapter04;
import java.util.Scanner;

public class D0817_���� {

	public static void main(String[] args) {

//		<< �Է� ���� >>
//		�ʱ����� : 000
//		�Ǳ����� : 000
//		
//		<< ��� ���� >>
//		���� : 000
//		��� : 000
//		��� : �հ� or ���հ�
//		�ʱ����� 40�� �̻��̰� �Ǳ⵵ 40 �̻��̰� ����� 60���̻��̸� "�հ�" �׷��� ������ "���հ�"�̶�� ���
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ʱ� ������ �Է��ϼ��� : ");
		int x = s.nextInt();
		System.out.print("�Ǳ� ������ �Է��ϼ��� : ");
		int y=s.nextInt();
		int z=(x+y)/2;
		System.out.println("���� : "+(x+y));
		System.out.println("��� : "+z);
		
		if (x>=40 && y>=40 && z>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
			

		}
		
		
		
	}

}
