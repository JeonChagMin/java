
public class Ex01_변수2단원 {

	public static void main(String[] args) {

		/* 
		변수 만드는 방법
		1. 변수 선언 : int,double 등 선언할 변수 자료 형태에 따라 변수를 선언한다.
		똑같은 형태의 변수는 한번에 여러 개를 선언할 수 있다.
		ex(int x, y, z;) 다른 종류는 각각 선언해야 한다.
		2. 값 저장 : =를 사용하여 변수의 값을 저장한다. 이때 변수에 값을 저장하는 과정을 초기화라고 하며
		처음 저장된 값을 초기값이라고 한다.
		3. 변수 사용
		* 주의 사항 : 변수 초기화 즉 초기값을 저장하지 않으면 오류가 생겨 값이 나오지 않는다. * 
		* 변수는 숫자로 시작되어서는 안되며, 되도록이면 한글로도 하지 않는다. ( 오류의 원인이 될 수도 있다. )
	     */
		int value;
		value=10;
		int result = value + 10;
		System.out.println(result);
	}

}
