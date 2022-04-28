package Map�÷��ǿ�������;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;

public class D1025_05 {

	public static void main(String[] args) {

		Map<String, Point> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		while (true) {
			String name = "";
			int num = 0;
			try {
				System.out.print("ȸ������ �̸� : ");
				name = s.nextLine();
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
						throw new InputMismatchException();
					} else if (name.charAt(i) == ' ') {
						throw new Exception();
					}
				}
				if (name.equals("����")) {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("�̸����� ������ �ѱ۸� �Է����ּ���");
			} catch (Exception e) {
				System.out.println("����� �������� �Է����ּ���");
			}
			
			System.out.print("����Ʈ���� : ");
			try {
				num = s.nextInt();
				s.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("����Ʈ���� ���ڸ� �Է����ּ���");
			}
			if (map.containsKey(name)) {
				map.put(name, new Point(name, map.get(name).point + num));
			} else {
				map.put(name, new Point(name, num));
			}
		}
		Set<Map.Entry<String, Point>> mapset = map.entrySet();
		Iterator<Map.Entry<String, Point>> it = mapset.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Point> mapEntry = it.next();
			Point p = mapEntry.getValue();
			System.out.println(p.name + " ȸ������ ����Ʈ ������ : " + p.point + "�Դϴ�.");
		}

		System.out.print("Ȯ���ϰ� ���� ȸ������ ����Ʈ :");
		String people = s.nextLine();
		if (map.containsKey(people)) {
			System.out.println(people + " ȸ������ ����Ʈ�� : " + map.get(people).point + "�Դϴ�");
		} else {
			System.out.println(people + "ȸ������ �������� �ʽ��ϴ�.");
		}

	}

}

class Point {
	String name;
	int point;

	Point(String n, int p) {
		name = n;
		point = p;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return p.name.equals(name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
