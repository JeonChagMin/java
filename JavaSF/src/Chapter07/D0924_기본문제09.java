package Chapter07;

public class D0924_�⺻����09 {

	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index

	
	void buy(Product p) {
		if (money >= p.price) {
			money -= p.price;
			add(p);
		} else {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� ��� �����ϴ�.");
		}
	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] cart1 = new Product[cart.length * 2];
			System.arraycopy(cart, 0, cart1, 0, cart.length);
			cart = cart1;
		}
		cart[i] = p;
		i++;
	}

	void summary() {
		int sum = 0;
		String list ="";
		for (int i = 0; i < cart.length; i++) {
			list +=cart[i]+", ";
			sum += cart[i].price;
		}

		System.out.println("������ ���� : "+list);
		System.out.println("����� �ݾ� " + sum);
		System.out.println("���� �ݾ� " + money);
	}
}

class Product {
	
	
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}