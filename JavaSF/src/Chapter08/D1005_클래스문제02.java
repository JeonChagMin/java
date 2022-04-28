package Chapter08;

import java.util.Scanner;

public class D1005_클래스문제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math=s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은 "+me.average());
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
