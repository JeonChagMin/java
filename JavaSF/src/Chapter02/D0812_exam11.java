package Chapter02;
import java.util.Scanner;

public class D0812_exam11 {

	public static void main(String[] args) {

//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		System.out.println(score + "���� " + grade + "����Դϴ�");

		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num=s.nextInt();
		String str = num>0 ? "���" : num==0 ? "��" : "����";
		System.out.println("�Է��� ���� "+str+"�Դϴ�");
		
		
	}

}
