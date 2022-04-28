package Chapter07;

public class D0927_Ãß»óÅ¬·¡½º_ex02 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		animalSound(cat);

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

abstract class Animal {
	public String kind;

	void breathe() {
		System.out.println("¼û");
	}

	abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "Æ÷À¯·ù";
	}

	@Override
	void sound() {
		System.out.println("¸Û¸Û");

	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "Æ÷À¯·ù";
	}

	@Override
	void sound() {
		System.out.println("¾ß¿Ë");
	}
}