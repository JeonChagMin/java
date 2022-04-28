package Chapter07;

public class D0924_기본문제09 {

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
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	
	void buy(Product p) {
		if (money >= p.price) {
			money -= p.price;
			add(p);
		} else {
			System.out.println("잔액이 부족하여 " + p + "를/을 살수 없습니다.");
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

		System.out.println("구입한 물건 : "+list);
		System.out.println("사용한 금액 " + sum);
		System.out.println("남은 금액 " + money);
	}
}

class Product {
	
	
	int price; // 제품의 가격

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