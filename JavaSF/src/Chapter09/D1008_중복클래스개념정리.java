package Chapter09;

public class D1008_중복클래스개념정리 {
	
//	$표시는 왼쪽의 멤버클래스라는 의미이다.
	int a;
	int[] ar;
	static int b;
	
	InstInner inst;

	class InstInner {
//		인스트 클래스
		int aa;
		String bb;
		boolean cc;
//		한가지 타입만이 아니라 다양한 타입의 변수를 저장하기 위해서 사용한다.
	}

	static class StaticInner {
//		스태틱 클래스
	}

	void method() {
		class LocalInner {
//		로컬 클래스
//		이 메소드안에서만 클래스를 사용하기 위해서 사용된다.
//		Scanner는 그럼 로컬 클래스였던 건가? 이미 다른 곳에서 만들어진 클래스이기 때문에 중복클래스와는 관련이 없다.

		}
	}

}
