package Chapter08;

public class D0928_�������̽�_����������03 {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}

interface Soundable{
	String sound();
}


class Cat implements Soundable {

	@Override
	public String sound() {
		return "�߿�";
	}
	
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "�۸�";
	}
}