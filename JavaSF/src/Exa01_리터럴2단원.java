
public class Exa01_리터럴2단원 {

	public static void main(String[] args) {

		/*
		 * 리터럴 : 소스 코드에서 프로그래머에 의해 직접입력된 값을 말한다. 2진수, 8진수, 10진수, 16진수가 있다. 2진수 : 0b 또는
		 * 0B로 시작하고 뒤에 2진수를 적는다. ( 0b1011 = 11 ) 8진수 : 0으로 시작하고 0 ~ 7 숫자로 구성된다. ( 013 =
		 * 11 ) 10진수 : 소수점이 없는 0 ~ 9 숫자로 구성된다, ( 12 = 12 ) 16진수 : 0X 또는 0x로 시작하고 0 ~ 9 와
		 * 대소문자 구분없이 abcdef로 구성된다 ( 0xB3 = 179 )
		 */
		int var1 = 0b1011, var2 = 0206, var3 = 365, var4 = 0xB3;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	}

}
