package Chapter04;

public class D0817_exam01_if문 {

	public static void main(String[] args) {

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90점보다 큽니다,");
			System.out.println("등급은 A입니다");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다");
		System.out.println("등급은 B입니다");

	}

}
