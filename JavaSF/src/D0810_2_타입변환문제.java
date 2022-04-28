
public class D0810_2_타입변환문제 {

	public static void main(String[] args) {

//		1. num은 백의 아래의 수는 다 버리는 변수이다.
//		int num = 456;
//		System.out.print(num / 100 * 100);

//		2. 변수 num의 값 중에서 일의 자리는 1로 바꾸는코드이다.
//		int num = 777;
//		System.out.println(num / 10 * 10 + 1);

//		3. 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
//		c=30
//		ch=C
//		f=1.5
//		L=27000000000
//		result=true
		
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = (float) 3 / 2;
		long l = 3000l * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
//		float 를 double 로 변경했을시에 나타나지 못하는 수가 있을 수 있기 때문에 오류가 생길수도 있으니
//		더 큰 수인 double 을 작은 수 float 로 바꿔야 오류를 줄일수 있다. 
//		*캐스팅은 큰걸 작은걸로 변경했을 때 사용한다.*
//		ex) float = 0.10000f, double 0.100001 이라면 double 을 float 으로 바꿔야 오류를 줄일 수 있다.
		boolean result = (float) d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
	}

}
