package Chapter07;

public class D0924_기본문제06 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		System.out.println(deck.pick(0));

	}

}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		int n = 0;
		boolean isKwang = false;
		for (int i = 0; i < 10; i++) {
			n = i + 1;
			if (n == 1) {
				isKwang = true;
			} else if (n == 3) {
				isKwang = true;
			} else if (n == 8) {
				isKwang = true;
			} else {
				isKwang = false;
			}
			SutdaCard s = new SutdaCard(n, isKwang);
			cards[i] = s;
		}
		for (int i = 10; i < 20; i++) {
			n = i - 9;
			SutdaCard s = new SutdaCard(n, isKwang);
			cards[i] = s;
		}

	}

	void shuffle() {

		for (int i = 0; i < 100; i++) {
			int st = (int) (Math.random() * cards.length);
			int ed = (int) (Math.random() * cards.length);
			SutdaCard imsi = new SutdaCard();
			imsi = cards[st];
			cards[st] = cards[ed];
			cards[ed] = imsi;
		}
	}

	SutdaCard pick(int index) {
//		유효성 검사는 필수로 해줘야한다.
		if (index >= 0 && index < CARD_NUM) {
			return cards[index];
		}
		return null;
	}

	SutdaCard pick() {
		int n = (int) (Math.random() * 20);
		return cards[n];
	}

}

class SutdaCard {
	boolean isKwang;
	int num;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
