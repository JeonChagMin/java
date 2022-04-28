package Chapter06;

public class D0908_클래스_기본문제02 {

	public static void main(String[] args) {
		Student s = new Student("본인이름", 1, 1, 100, 60, 76);
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.println(s.info());

	}

	
}

class Student {
	String name = "홍길동";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student() {
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban =ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	int getTotal() {
		int total = kor + eng + math;
		return total;
	}

	
	double getAverage() {
		return (int) (getTotal() / 3. * 10) / 10.;
	}

	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", "
				+ getAverage();
	}
}







