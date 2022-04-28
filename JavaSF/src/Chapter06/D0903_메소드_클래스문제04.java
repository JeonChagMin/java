
package Chapter06;

public class D0903_메소드_클래스문제04 {

	public static void main(String[] args) {
		Dd dd = new Dd();
		int[] ar = new int[10];
		ar = dd.up();
		for (int a : ar) {
			System.out.print(a + " ");
		}
		System.out.println();
		ar = dd.down();
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}

}

class Dd {
	int[] up() {
		int[] up = new int[30];
		for (int i = 0; i < up.length; i++) {
			up[i] = (int) (Math.random() * 45) + 1;
		}
		for (int i = 0; i < up.length; i++) {
			for (int j = i + 1; j < up.length; j++) {
				if (up[i] > up[j]) {
					int imsi = up[i];
					up[i] = up[j];
					up[j] = imsi;
				}
			}
		}
		return up;
	}

	int[] down() {
		int[] down = new int[30];
		for (int i = 0; i < down.length; i++) {
			down[i] = (int) (Math.random() * 45) + 1;
		}
		for (int i = 0; i < down.length; i++) {
			for (int j = i + 1; j < down.length; j++) {
				if (down[i] < down[j]) {
					int imsi = down[i];
					down[i] = down[j];
					down[j] = imsi;
				}
			}

		}
		return down;
	}
//	랜덤값을 오른차순으로 정렬 후 ar로 받아오고 한개씩 출력
}
