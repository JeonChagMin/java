package Map컬렉션연습문제;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class D1025_03 {

	public static void main(String[] args) {

		Map<String, Student1> map = new HashMap<String, Student1>();
		Scanner s = new Scanner(System.in);

		while (true) {
			String name = "";
			String id = "";
			int num = 0;
			while (true) {
				try {
					System.out.print("학생 이름 : ");
					name = s.nextLine();
					for (int i = 0; i < name.length(); i++) {
						if (name.valueOf(name.charAt(i)).matches("[^a-zA-Z가-힣\\s]")) {
							throw new InterruptedException();
						} else if (name.charAt(i) == ' ') {
							throw new Exception();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("영문과 한글을 제대로 입력해주세요");
				} catch (Exception e) {
					System.out.println("띄어쓰기를 하지말아주세요");
				}
			}
			if (name.equals("그만")) {
				break;
			}
			while (true) {
				try {
					System.out.print("학생 id : ");
					id = s.nextLine();
					for (int i = 0; i < id.length(); i++) {

						if (id.charAt(i) == ' ') {
							throw new InterruptedException();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("띄어쓰기를 하지 말아주세요");
				}
			}
			while (true) {
				try {
					System.out.print("학생 번호 : ");
					num = s.nextInt();
					s.nextLine();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요");
					s.next();
				}

			}
			map.put(name, new Student1(id, num));
		}

		while (true) {
			System.out.print("찾고 싶은 학생의 이름 : ");
			String name1 = "";
			try {
				name1 = s.nextLine();
				if (name1.equals("그만")) {
					System.out.println("프로그램 종료");
					break;
				}
				for (int i = 0; i < name1.length(); i++) {
					if (name1.valueOf(name1.charAt(i)).matches("[^a-zA-Z가-힣\\s]")) {
						throw new InterruptedException();
					} else if (name1.charAt(i) == ' ') {
						throw new Exception();
					}
				}
			} catch (InterruptedException e) {
				System.out.println("영문과 한글을 제대로 입력해주세요");
			} catch (Exception e) {
				System.out.println("띄어쓰기를 하지말아주세요");
			}
			if (map.containsKey(name1)) {
				System.out.println(name1);
				System.out.println("학생의 ID : " + map.get(name1).getId());
				System.out.println("비밀번호 : " + map.get(name1).getNum());
			} else {
				System.out.println("학생의 이름을 다시 입력해주세요");
			}
		}
	}

}

class Student1 {
	private String id;
	private int num;

	Student1(String na, int n) {
		id = na;
		num = n;
	}

	public String getId() {
		return id;
	}

	public int getNum() {
		return num;
	}
}