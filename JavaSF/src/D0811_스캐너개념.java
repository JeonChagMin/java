import java.util.Scanner;

public class D0811_��ĳ�ʰ��� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		�⺻ ���°� �ƴ� ���� �ٷ� �ԷµǴ� ���� �ƴ� �ּҸ� �ҷ����� ���·� �����Ѵ�.
//		nextInt �� ������ �ϱ� ���� ��ɾ�� enter �̴�. ���ڸ� �Է��ϰ� ������ ������ �ȵȴ�.
//		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
//		int num=s.nextInt();
//		System.out.print("�Ǽ� �ϳ��� �Է��ϼ��� : ");
//		double num1=s.nextDouble();
//		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
//		String ch = s.next();
//		System.out.print("���ڿ� �Է��ϼ��� : ");
//		String str=s.next();
//		System.out.println(num);
//		System.out.println(num1);
//		System.out.println(ch);
//		System.out.println(str);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = s.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = s.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		double tall = s.nextDouble();
		s.nextLine();
//		���ڿ����� ������� �о�� ���ؼ��� next �� ���� ���� �ƴ϶� nextLine �� �Է��ؾ� �Ѵ�.
//		nextLine �� ���� �Է��� enter ���� �о�� ������ ���� �Է��� enter �� �����ϱ� ���� �ι� ����.
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String add = s.nextLine();

		System.out.println("�� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		System.out.println("�� Ű�� " + tall + "�Դϴ�.");
		System.out.println("�� �ּҴ� " + add + "�Դϴ�.");

	}

}
