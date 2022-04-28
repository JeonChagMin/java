package Map컬렉션연습문제;

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
				System.out.print("회원님의 이름 : ");
				name = s.nextLine();
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
						throw new InputMismatchException();
					} else if (name.charAt(i) == ' ') {
						throw new Exception();
					}
				}
				if (name.equals("종료")) {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("이름에는 영문과 한글만 입력해주세요");
			} catch (Exception e) {
				System.out.println("띄어쓰기는 하지말고 입력해주세요");
			}
			
			System.out.print("포인트점수 : ");
			try {
				num = s.nextInt();
				s.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("포인트에는 숫자만 입력해주세요");
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
			System.out.println(p.name + " 회원님의 포인트 점수는 : " + p.point + "입니다.");
		}

		System.out.print("확인하고 싶은 회원님의 포인트 :");
		String people = s.nextLine();
		if (map.containsKey(people)) {
			System.out.println(people + " 회원님의 포인트는 : " + map.get(people).point + "입니다");
		} else {
			System.out.println(people + "회원님은 존재하지 않습니다.");
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
