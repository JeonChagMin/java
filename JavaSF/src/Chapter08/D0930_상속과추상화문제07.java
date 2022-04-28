package Chapter08;

public class D0930_상속과추상화문제07 {

	public static void main(String[] args) {
		Point3D p =new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다");


	}

}

class Point3D extends Point {
	private int z = 0;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown() {
		z--;
	}
	
	void move(int x, int y,int z) {
		super.move(x, y);
		this.z=z;
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
}
