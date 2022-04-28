package Chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class D1022_�÷��ǿ�������05 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		int number =0;
		double ave =0;
		while (true) {
			
		System.out.print("�л� ������ �Է����ּ��� : ");
		String information = s.nextLine();
		String in = information.trim();
		String[] ex = in.split(",");
		String[] i = new String[ex.length];
		for (int j = 0; j < ex.length; j++) {
			i[j] = ex[j].trim();
		
		}
		String out = i[0].toLowerCase();
		if(out.equals("stop")) {
			break;
		}
		number = Integer.parseInt(i[2]);
		ave = Double.parseDouble(i[3]);
		list.add(new Student(i[0],i[1],number,ave));
		
		}
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		
		while (true) {
			System.out.print("�л� �̸� : ");
			String name = s.next();
			if (name.equals("����")) {
				System.out.println("���α׷� ����");
				break;
			}
			int n = 0;
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name)) {
					n++;
					System.out.println(list.get(i));
				}
			}
			if (n==0) {
				System.out.println("�л� �̸��� �߸� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}

class Student {
	String name;
	String subject;
	int number;
	double ave;
	Student(String n, String s, int nu, double a) {
		name= n;
		subject=s;
		number=nu;
		ave =a;
	}
	
	@Override
	public String toString() {
		return "�л� �̸� : "+name+" �а� : "+subject+" �й� "+number+" ������� "+ ave;
	}
}
