package Chapter08;

import java.util.Scanner;

public class D1005_Ŭ��������08 {

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
		System.out.print("�ο��� >> ");
		x = s.nextInt();
		phone = new Phone[x];
		for (int i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) >> ");
			name = s.next();
			tel = s.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");

		while (true) {
			System.out.println("�˻��� �̸� >> ");
			int index = -1;
			String n = s.next();
			for (int i = 0; i < phone.length; i++) {
				if (n.equals(phone[i].getName())) {
					index = i;
				}
			}
			if (n.equals("�׸�")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			if (index == -1) {
				System.out.println(n + " �� �����ϴ�.");
			} else {
				System.out.println(phone[index].getName() + "�� ��ȣ�� " + phone[index].getTel() + " �Դϴ�.");
			}
		}
	}

}