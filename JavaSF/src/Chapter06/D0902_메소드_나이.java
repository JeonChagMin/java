package Chapter06;

import java.util.Scanner;

public class D0902_�޼ҵ�_���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������� �Է� : ");
		int year = s.nextInt();
		int age = calcAge(year);
		System.out.println(year+"�⵵�� ����� ��� ���� : "+age);

	}

	private static int calcAge(int year) {
		int age = 2021-year+1;
		return age;
//		age �� �޾ƺ��� �� �Ŀ� �� ����� ���� ������쿡�� �̷��� �Ѵ�.
//		��¸� �ϰ� �����Ÿ� �޼ҵ忡 ��±��� �ϴ� �� �� �����ؼ� ��� �ȴ�.
	}
}
