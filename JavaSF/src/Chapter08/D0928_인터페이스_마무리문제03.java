package Chapter08;

public class D0928_牢磐其捞胶_付公府巩力03 {
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
		return "具克";
	}
	
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "港港";
	}
}