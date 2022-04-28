package Chapter07;

public class D0915_상속_기본문제04 {

	public static void main(String[] args) {

	}

}

class Parent1 {
	String name;
	
	Parent1() {
		
	}
	
	Parent1(String name){
		this.name = name;
	}
	
}

class Child1 extends Parent1 {
	private int student;
	
	Child1(String name, int student){
		super();
		this.name = name;
		this.student = student;

	}
	
}
