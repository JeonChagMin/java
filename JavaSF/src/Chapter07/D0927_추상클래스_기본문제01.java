package Chapter07;

class D0927_추상클래스_기본문제01 {
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합 : " + sumArea(arr));

		Circle c = new Circle(new Point(3, 5), 3.4);
		System.out.println(c.getPosition());

		Rectangle r = new Rectangle(new Point(5, 3), 4, 3);
		System.out.println(r.getPosition());

	}
}

class Circle extends Shape {
	double r;

	Circle() {
		super();

	}

	Circle(double r) {
		this.r = r;
	}

	Circle(Point point, double r) {
		this.p = point;
		this.r = r;
	}

	@Override
	double calcArea() {

		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	double width;
	double height;

	public Rectangle() {
		super();
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point point, double width, double height) {
		this.p = point;
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}

	boolean isSquare() {
		if (width == height) {
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("정사각형이 아닙니다.");
		}
		return true;
	}

}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
