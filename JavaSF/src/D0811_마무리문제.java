import java.util.Scanner;

public class D0811_���������� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		����1
//		String name = "���ڹ�";
//		int age = 25;
//		String tell1 = "010", tell2 = "123", tell3 = "4567";
//		System.out.println("�̸� : "+name);
//		System.out.print("���� : "+age+"\n");
//		System.out.printf("��ȭ : %1$s-%2$s-%3$s",tell1,tell2,tell3);
		
//		����2
//		System.out.print("ù��° �� : ");
//		String strNum1 =s.next();
//
//		System.out.print("�ι�° �� : ");
//		String strNum2 = s.next();
//		
//		int num1 =Integer.parseInt(strNum1);
//		int num2 =Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("���� ��� : "+result);
		
//		����3
		System.out.print("�̸��� �Է����ּ��� : ");
		String name1 = s.next();
		
		System.out.print("�ֹι�ȣ �� 6�ڸ��� �Է��� �ּ��� : ");
		int num=s.nextInt();
		s.nextLine();
		System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
		String num1=s.nextLine();
		
		System.out.println("1. �̸� : "+name1);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ� : "+num);
		System.out.println("3. ��ȭ��ȣ : "+num1);
		
		
	}

}
