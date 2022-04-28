package Chapter07;

public class D0927_�߻�Ŭ����_ex02 {

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
		System.out.println("��");
	}

	abstract void sound();
}

class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}

	@Override
	void sound() {
		System.out.println("�۸�");

	}
}

class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}

	@Override
	void sound() {
		System.out.println("�߿�");
	}
}