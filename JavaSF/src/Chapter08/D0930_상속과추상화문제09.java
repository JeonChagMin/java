package Chapter08;

import java.util.Scanner;

public class D0930_��Ӱ��߻�ȭ����09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int capacity = s.nextInt();
		StringStack app = new StringStack(capacity);
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String word = s.next();
			if (word.equals("�׸�")) {
				break;
			}
			if (app.push(word)!=true) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}

		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for (int i = 0; i < capacity; i++) {
		System.out.print(app.pop() + " ");
		}
	}

}

class StringStack implements Stack {

	Scanner s = new Scanner(System.in);
	int index = 0;
	String[] val;
	String word;
	int capaticy;
	boolean push = true;

	StringStack(int size) {
		this.capaticy=size;
		capacity();
		this.index = 0;
	}
	@Override
	public int length() {
		return this.index;
	}

	@Override
	public int capacity() {
		val = new String[this.capaticy];
		return this.capaticy;
	}

	@Override
	public String pop() {
		if (index==0) {
			return null;
		}
		return val[--index];
	}

	@Override
	public boolean push(String val) {
		if (index == capaticy) {
			return false;
		}
		this.val[index++] = val;
		return true;

	}

}

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}