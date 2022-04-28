
public class Ex03_변수 {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		// 어차피 x,y는 같은 정수 변수이기 때문에 int x,y;으로 써도 괜찮다.
		System.out.println("x : " + x + ", y : " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);
		/*
		 * 변수는 가장 최근에 입력된 값으로 값이 정해진다(복사같은 개념으로 생각하자) int z = x*2; int q=5; x = q;
		 * System.out.println("z:" + z + ", x:" + x);
		 */

		int a = 1, b = 2, c = 3, d = 4;
		int tem = a;
		a = b;
		b = c;
		c = d;
		d = tem;
		System.out.println("a : " + a + ", b : " + b + ", c : " + c + ", d : " + d);
		// 위의 상황같은 경우에는 a의 값이 기존에 설정했던 값과 다르기 때문에 다른 곳에다가 저장해둔 다음 사용해야한다.

	}

}
