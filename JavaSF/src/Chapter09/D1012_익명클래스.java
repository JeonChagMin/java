package Chapter09;

public class D1012_익명클래스 {

	public static void main(String[] args) {
		Animal a = new Animal() {
			void eat() {
				System.out.println("먹습니다");
			}
			@Override
			void cry() {
				System.out.println("멍멍멍");
				eat();
//				상위 클래스에 해당하지 않는 메소드는 사용 할 수 없기 때문에 안에 실행할 수 있도록 만들어야 한다.
			}
		};
		
		a.cry();
		

	}

}

class Animal {
	void cry() {
		System.out.println("웁니다");
	}
}
