package Chapter11;

public class D1018_연습문제0102 {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p);

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		if (a == b) {
			System.out.println("a==b");
		}
		if (a.equals(b)) {
			System.out.println("a와 b는 같은 점");
		}
		if (a.equals(c)) {
			System.out.println("a와 c는 같은 점");
		}
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}

}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {

			Point p = (Point) obj;
			if (this.x == p.x && this.y == p.y) {
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public int hashCode() {
//		return x+y;
//	}

}
