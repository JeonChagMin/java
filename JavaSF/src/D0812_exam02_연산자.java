
public class D0812_exam02_������ {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x="+x);
		//x12
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y="+y);
		//y8
		System.out.println("---------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		//z12 x13
		System.out.println("---------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		//x14 z14
		System.out.println("---------------");
		z= ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		//x15 z23 y9
	}

}
