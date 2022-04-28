package Map�÷��ǿ�������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class D1026_List05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Student> map = new HashMap<String, Student>();
		int number = 0;
		double ave = 0;
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
			if (out.equals("stop")) {
				break;
			}
			number = Integer.parseInt(i[2]);
			ave = Double.parseDouble(i[3]);
			map.put(i[0], new Student(i[0], i[1], number, ave));

		}

		Set<Map.Entry<String, Student>> mapset = map.entrySet();
		Iterator<Map.Entry<String, Student>> mapit = mapset.iterator();
		while (mapit.hasNext()) {
			Map.Entry<String, Student> mapEntry = mapit.next();
			Student t = mapEntry.getValue();
			System.out.println(t);
		}

		while (true) {
			System.out.print("�л� �̸� : ");
			String name = s.next();
			if (name.equals("����")) {
				System.out.println("���α׷� ����");
				break;
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
		name = n;
		subject = s;
		number = nu;
		ave = a;
	}

	@Override
	public String toString() {
		return "�л� �̸� : " + name + " �а� : " + subject + " �й� " + number + " ������� " + ave;
	}
}