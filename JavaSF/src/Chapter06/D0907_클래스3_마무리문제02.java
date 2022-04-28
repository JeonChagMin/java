package Chapter06;

public class D0907_클래스3_마무리문제02 {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");

	}

}

class Member {
	String name;
	String id;

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}