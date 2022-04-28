
public class D0809_1_자동타입변환 {

	public static void main(String[] args) {

//		byte a = 10;
//		short b = 0;
//		b=a; 왼쪽에 있는 것이 오른쪽에 있는 것보다 크기가 커야한다.

//		byte<short<int<long<float<double  크기순 ( long은 8byte지만 실수를 포함하는 float 보다 크기가 작다. )  
//		이 순으로 작은 것에서 큰 것으로 자동 타입 변환이 일어난다.
//		char는 음수가 아닌 양수만 나타나기 때문에 short와 크기는 같아도 범위가 달라 타입 변환이 불가능하다.

//		char a = 150;
//		byte b = 127;
//		short c = 129;
//		int d = 30;
//		long e = 15L;
//		강제로 변환을 하면 내가 원하는 값과 다르게 나올 수있다.
//		값이 크기를 초과하는 경우 cycle처럼 돌아가면서 값이 나온다.
//		b = (byte) c;
//		System.out.println(b);
//
//		double x = 3.14;
//		int x1 = (int) x;
//		System.out.println(x1);  이 처럼 실수를 정수로 바꾸는 경우에는 정수부분만 나온다.
		
//		int a = 130; 
//		byte b = 0;
//		a=b; 여기에서 이미 a의 값은 0으로 바뀌었다.
//		b=(byte)a;
//		System.out.println(b);
//		순서대로 계산을 하기 때문에 값은 -126이 아니라 0이다.
		
	}
}
