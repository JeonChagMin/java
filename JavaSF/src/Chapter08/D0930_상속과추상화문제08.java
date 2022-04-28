package Chapter08;

public class D0930_상속과추상화문제08 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,10);
		System.out.println(p2.toString()+"입니다.");

	}

}

class PositivePoint extends Point {

	PositivePoint() {
		super(0,0);
	}
	
	PositivePoint(int x, int y) {
		super(x, y);
		if (x<=0) {
			super.move(0, 0);
		}
		else if (y<=0) {
			super.move(0, 0);
		} else {
			super.move(x, y);
		}
		
	}
	
	@Override
	protected void move(int x, int y) {
		if (x<=0) {
			super.move(getX(), getY());
		}
		else if (y<=0) {
			super.move(getX(), getY());
		}
		else {
		super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
	
	
}