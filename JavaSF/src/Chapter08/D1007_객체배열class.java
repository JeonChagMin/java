package Chapter08;

import java.util.Scanner;

public class D1007_��ü�迭class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� : ");
		int num = s.nextInt();
		Ban[] b = new Ban[num];
		for (int i = 0; i < b.length; i++) {
			System.out.println(i+1+"���� �л� ������ �Է��ϼ���");
			b[i] = new Ban();
		}
		
		System.out.print("�� �Է� : ");
		int ban = s.nextInt();
		b[ban-1].show();
		
	}

}

class Student {
	private String name;
	private int grade;

	Student() {
	}

	Student(String n, int g) {
		name = n;
		grade = g;
	}

	@Override
	public String toString() {
		return name + "�л��� ������ : " + grade + "�Դϴ�.";
	}
}

class Ban extends Student {
	Student[] student;
	Scanner s;
	String jung="";

	Ban() {
		s = new Scanner(System.in);
		System.out.print("�л��� : ");
		int num = s.nextInt();
		student = new Student[num];
		for (int i = 0; i < student.length; i++) {
			System.out.print("�л� �̸� : ");
			String n = s.next();
			System.out.print("���� : ");
			int g = s.nextInt();
			student[i] = new Student(n, g);
		}
	}
	
	void show() {
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}

	}


}
