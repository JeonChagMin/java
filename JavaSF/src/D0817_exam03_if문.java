import java.util.Scanner;

public class D0817_exam03_if�� {

	public static void main(String[] args) {

//		int score = 75;
//
//		if (score >= 90) {
//			System.out.println("������ 100~90�Դϴ�.");
//			System.out.println("����� A�Դϴ�");
//		} else if (score >= 80) {
//			System.out.println("������ 80~89�Դϴ�");
//			System.out.println("����� B�Դϴ�.");
//		} else if (score >= 70) {
//			System.out.println("������ 70~79�Դϴ�.");
//			System.out.println("����� C�Դϴ�");
//		} else {
//			System.out.println("������ 70 �̸��Դϴ�.");
//			System.out.println("����� D�Դϴ�");
//		}
		
//		int kor = 75, mat=65;
//		��� 90�̻��̰� ������ 88�̻��̸� "A"
//		��� 80�̻��̰� ������ 76�̻��̸� "B"
//		��� 70�̻��̰� ������ 65�̻��̸� "C"
//		��� 70�̸��̰� ������ 65�̸��̸� "D"
//		
//		if (kor >= 90 && mat >=88) {
//			System.out.println("����� A�Դϴ�.");
//		} else if (kor >= 80 && mat >=76) {
//			System.out.println("����� B�Դϴ�.");
//		} else if (kor >= 70 && mat >=65) {
//			System.out.println("����� C�Դϴ�.");
//		} else {
//			System.out.println("����� D�Դϴ�.");
//		}
//		
//		Scanner �̿�, ����, ����, ���� �Է� �޾Ƽ� ����� ���� ��
//		���� 90 �̻��̸� ����� "A"
//		���� 88 �̻��̸� ����� "B"
//		���� 78 �̻��̸� ����� "C"
//		���� 70 �̻��̸� ����� "D"
//	    �������� "F"
		Scanner s= new Scanner(System.in);
		
		System.out.print("���������� �Է����ּ��� : ");
		int kor = s.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int mat = s.nextInt();
		System.out.print("���������� �Է����ּ��� : ");
		int eng = s.nextInt();
		int ave = (kor + mat + eng)/3;
		
		if (ave >=90) {
			System.out.println("A ����Դϴ�.");
		} else if (ave >=88) {
			System.out.println("B ����Դϴ�.");
		} else if (ave >=78) {
			System.out.println("C ����Դϴ�.");
		} else if (ave >=70) {
			System.out.println("D ����Դϴ�.");
		} else {
			System.out.println("F ����Դϴ�.");
		}
		

	}

}
