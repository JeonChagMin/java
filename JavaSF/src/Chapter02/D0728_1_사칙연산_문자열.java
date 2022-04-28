package Chapter02;

public class D0728_1_사칙연산_문자열 {

	public static void main(String[] args) {
		/*
		 * ()안에 "이 없을시에는 +(숫자를 사용했을시)는 수식 역할을 하지만 "가 있을경우 +는 수식 역할을 하지않고 연결
		 * 역할만한다.ex)print("3+4="+3+4) 이렇게 입력한 경우 3+4=34으로 나온다. System.out.println("3+4="
		 * + (3+4)); System.out.println("5*6=" + 5*6); System.out.println("52-8="+
		 * (52-8)); System.out.println("20/5="+ 20/5); System.out.println("20%7="+
		 * 20%7);
		 */
		String a = "광주광역시";
		a = "부산광역시";
		/*
		 * 컴퓨터 프로그램 상의 =는 왼쪽이 오른쪽의 내용을 담아두는 역할을 한다. 왼쪽의 a는 광주광역시를 담아두고 있는 역할을 한다. 문자
		 * =>', 문자열 => " 'a'=문자, "a"=문자열 "안의 내용은 문자열이라고 한다. 문자열 앞에는 String(앞에 문자를 넣을경우)을
		 * 붙여야한다. System.out.println("광주광역시 북구 중흥동");
		 * System.out.println("광주광역시 동구 산수동"); System.out.println("광주광역시 남구 주월동");
		 * System.out.println("광주광역시 서구 화정동"); 이렇게 중복되는 내용이 있을 경우 중복되는 내용을 묶어서 사용할수있다.
		 * 위의 a를 변수라고 말한다. 변수를 설정할때 처음에만 string 문자를 써주고 그 후에는 string를 쓰지않아도 가능하다. 변수 선언은
		 * 한번만하면 된다.
		 */

		System.out.println(a + " 북구 중흥동");
		System.out.println(a + " 동구 산수동");
		System.out.println(a + " 남구 주월동");
		System.out.println(a + " 서구 화정동");

		/*
		 * int a=10; 정수(int), 실수(double), 문자는 앞을 다르게 적어야한다. 이와같은 과정(int a)을 '변수를 선언한다'라고
		 * 한다. 정수를 정리할경우 int(정수의 영단어)를 앞에 적어야한다. (이와 같은 경우에는 a는 정수형 변수라고한다.)
		 * 
		 * a=a+10; 변수에는 마지막으로 담은 내용이 들어간다.
		 * 
		 */
	}

}
