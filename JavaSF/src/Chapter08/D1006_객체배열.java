package Chapter08;

import java.util.Scanner;

public class D1006_객체배열 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("고객의 수 : ");
		int num = s.nextInt();
		Customer[] c =new Customer[num];
		for (int i = 0; i < num; i++) {
			System.out.print("이름 : ");
			String n = s.next();
			System.out.print("나이 : ");
			int a =s.nextInt();
			System.out.print("취미 : ");
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
		System.out.print(name+" 고객님의 나이는 "+age+"이고, ");
		System.out.println("취미는 "+hobby+" 입니다.");
	}
	
	
}
