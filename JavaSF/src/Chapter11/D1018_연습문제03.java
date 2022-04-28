package Chapter11;

public class D1018_연습문제03 {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		if (a.equals(b)) {
			System.out.println("a와 b는 같은 Rect");
		}
		if (a.equals(c)) {
			System.out.println("a와 c는 같은 Rect");
		}
		if (b.equals(c)) {
			System.out.println("b와 c는 같은 Rect");
		}
	}

}

class Rect {
	int width;
	int height;
	int result;

	Rect(int x, int y) {
		width = x;
		height = y;
		result = width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rect) {
			Rect r = (Rect) obj;
			if (result == r.result) {
				return true;

			}
		}
		return false;
	}
}
