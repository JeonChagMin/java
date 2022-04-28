package Chapter07;

public class D0927_추상클래스_ex01 {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();

	}

}

 abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner =owner;
	}
	
	public void turnOn() {
		System.out.println("전원 킴");
	}
	
	public void turnOff() {
		System.out.println("전원 끔");
	}
}

 class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색");
	}
}
