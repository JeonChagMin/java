package Chapter02;
import java.util.Scanner;


public class D0812_���������� {

	public static void main(String[] args) {

//		���� 9�� �ҽ�����
		Scanner s = new Scanner(System.in);
//		System.out.print("ù ��° �� : ");
//		double a =s.nextDouble();
//		System.out.print("�� ��° �� : ");
//		double b =s.nextDouble();
//		double c =a/b;
//		System.out.println("-----------------");
//		
//		if (c>0) {
//			System.out.println("��� : "+a/b);
//			
//		}else {
//			System.out.println("��� : ���Ѵ�");
//		}
//		

//		���� 11��
		
		System.out.println("���̵� : ");
		String name =s.nextLine();
		System.out.println("�н����� : ");
		String password=s.nextLine();
		int password1 = Integer.parseInt(password);
		
		if (name.equals("java"))//String �� ���� �� equals �� ����Ͽ� ���ؾ��Ѵ�
			{
			if (password1 ==12345) {
			System.out.println("success");
		}else {
			System.out.println("�α��� ����");
		} 
		} else {
			System.out.println("�α��� ���� : ���̵� ����");
		}
		
		
		
	}

}
