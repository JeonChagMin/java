
public class Exa07_실수 {

	public static void main(String[] args) {

		// float var1 = 3.14;
		float var2 = 3.14f;
		double var3 = 3.14;

		float var4 = 0.1234567890123456789F; // 소수점 7자리 이상부터서는 오류가 발생하기 때문에 주의해야한다.
		double var5 = 0.1234567890123456789;

		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);

		double var6 = 3e6; // 3*1000000
		float var7 = 3e6F;
		double var8 = 2e-3; // 2*0.001
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
	}

}
