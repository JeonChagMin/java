package Chapter07;

public class D0915_���_�⺻����05 {

	public static void main(String[] args) {
		Child child = new Child();
	}

}

class Parent {
	public String nation;

	Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}

	Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent {
	private String name;

	Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}

	Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
