package Chapter07;

public class D0927_�߻�Ŭ����_ex01 {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
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
		System.out.println("���� Ŵ");
	}
	
	public void turnOff() {
		System.out.println("���� ��");
	}
}

 class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻�");
	}
}
