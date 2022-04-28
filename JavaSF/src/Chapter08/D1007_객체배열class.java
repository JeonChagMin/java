package Chapter08;

import java.util.Scanner;

public class D1007_객체배열class {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반 : ");
		int num = s.nextInt();
		Ban[] b = new Ban[num];
		for (int i = 0; i < b.length; i++) {
			System.out.println(i+1+"반의 학생 정보를 입력하세요");
			b[i] = new Ban();
		}
		
		System.out.print("반 입력 : ");
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
		return name + "학생의 성적은 : " + grade + "입니다.";
	}
}

class Ban extends Student {
	Student[] student;
	Scanner s;
	String jung="";

	Ban() {
		s = new Scanner(System.in);
		System.out.print("학생수 : ");
		int num = s.nextInt();
		student = new Student[num];
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생 이름 : ");
			String n = s.next();
			System.out.print("성적 : ");
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
