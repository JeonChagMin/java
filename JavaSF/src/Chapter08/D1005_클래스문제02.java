package Chapter08;

import java.util.Scanner;

public class D1005_Ŭ��������02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math=s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� "+me.average());
	}

}

class Grade {
	int math, science, english;
	int play=1;
	
	Grade(int math){
		this.math = math;
	}
	
	Grade(int math, int science) {
		this.math=math;
		this.science=science;
		play=2;
	}
	Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
		play=3;
	}
	int average() {
		return (this.math+this.science+this.english)/play;
	}
}
