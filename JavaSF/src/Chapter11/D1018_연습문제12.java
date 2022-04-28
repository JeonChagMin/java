package Chapter11;

public class D1018_연습문제12 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));

	}

	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		while (true) {
			if (src.indexOf(target, pos) == -1) {
				break;
			} else {
				count++;
				src.indexOf(target, pos);
				pos=src.indexOf(target,pos)+target.length();
			}
		}
		return count;

	}
}
