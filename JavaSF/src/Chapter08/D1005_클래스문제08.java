package Chapter08;

import java.util.Scanner;

public class D1005_클래스문제08 {

	public static void main(String[] args) {
		PhoneBook p = new PhoneBook();
		p.run();

	}

}

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setTel(String tel) {
		this.tel = tel;
	}

	String getTel() {
		return tel;
	}

}

class PhoneBook {
	Scanner s = new Scanner(System.in);
	Phone[] phone;
	int x;
	String name, tel;

	PhoneBook() {
	}

	void run() {
		System.out.print("인원수 >> ");
		x = s.nextInt();
		phone = new Phone[x];
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			name = s.next();
			tel = s.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.println("검색할 이름 >> ");
			int index = -1;
			String n = s.next();
			for (int i = 0; i < phone.length; i++) {
				if (n.equals(phone[i].getName())) {
					index = i;
				}
			}
			if (n.equals("그만")) {
				System.out.println("종료되었습니다.");
				break;
			}
			if (index == -1) {
				System.out.println(n + " 이 없습니다.");
			} else {
				System.out.println(phone[index].getName() + "의 번호는 " + phone[index].getTel() + " 입니다.");
			}
		}
	}

}