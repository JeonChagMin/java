package Chapter06;

public class D0910_Ŭ����_�⺻����03 {
	static double result;

	

	static double getDistance(int x, int y, int x1, int y1) {
		result = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));

		return result;
	}

	public static void main(String[] args) {
//		��Ʈ�� math.sqrt
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
