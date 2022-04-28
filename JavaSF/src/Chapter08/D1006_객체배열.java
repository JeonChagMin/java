package Chapter08;

import java.util.Scanner;

public class D1006_��ü�迭 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = s.nextInt();
		Customer[] c =new Customer[num];
		for (int i = 0; i < num; i++) {
			System.out.print("�̸� : ");
			String n = s.next();
			System.out.print("���� : ");
			int a =s.nextInt();
			System.out.print("��� : ");
			String h = s.next();
			c[i]=new Customer(n,a,h);
			System.out.println();
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}

	}

}

class Customer {
	private String name;
	private int age;
	private String hobby;

	Customer() {

	}

	Customer(String n, int a, String h) {
		name = n;
		age = a;
		hobby = h;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	void show() {
		System.out.print(name+" ������ ���̴� "+age+"�̰�, ");
		System.out.println("��̴� "+hobby+" �Դϴ�.");
	}
	
	
}
