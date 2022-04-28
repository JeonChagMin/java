package Chapter11;

public class D1018_연습문제06 {

	public static void main(String[] args) {
		String a="korea is java love table class";
		String s[] = a.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		
	}

}
