package Chapter08;

import java.util.Scanner;

public class D1005_클래스문제05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[]=new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i]=new Circle(x, y, r);
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}
		int area=0;
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i].area()>area) {
				area=c[i].area();
				index=i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[index].show();
		

	}

}

class Circle {
	private double x, y;
	private int radius;
	Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	int area () {
		return radius*radius;
	}
	
	void show() {
		System.out.println("("+this.x+", "+this.y+")"+this.radius);
		
	}
}



