package Chapter06;

public class D0910_Ŭ����_�⺻����03_1 {

	public static void main(String[] args) {
		Mypoint p = new Mypoint(1,1);
		System.out.println(p.getDistance(2, 2));

	}

}

class Mypoint {
	int x;
	int y;
	
	Mypoint ( int x, int y){
		this.x = x;
		this.y = y;
	}


	double getDistance(int x1, int y1) {
		double result = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
		return result;
	}

}
