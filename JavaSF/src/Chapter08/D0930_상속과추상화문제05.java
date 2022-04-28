package Chapter08;

public class D0930_��Ӱ��߻�ȭ����05 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "yello");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str= cp.toString();
		System.out.println(str+"�Դϴ�.");

	}

}

class ColorPoint extends Point {
	String color="BLACK";
	
	ColorPoint() {
		super(0, 0);
	}
	
	ColorPoint(int x, int y) {
		super(x,y);
	}

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		move(x,y);
		
	}

	void setColor(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}

	public String toString() {
	return (getColor() + "���� " + "(" + getX() + ", " + getY() + ")�� ��");
	

	}

}

class Point {
	private int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
