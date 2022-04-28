package Chapter02;

public class D0730_Exa08_논리 {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;
		boolean stop = a + b == c; // 부등호를 이용하여 조건식을 사용할수있다. ( <, <=, >, >=, == )
//		System.out.println(stop);
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");

		}
		// if( 논리값 )는 괄호안의 내용이 T/F를 나타내야한다. if와 else를 같이 쓴다. {}를 쓰는것도 잊지말자. 선택문이라고 한다.
	}

}
