package Chapter06;

public class D0908_Ŭ����_�⺻����02 {

	public static void main(String[] args) {
		Student s = new Student("�����̸�", 1, 1, 100, 60, 76);
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
		System.out.println(s.info());

	}

	
}

class Student {
	String name = "ȫ�浿";
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







