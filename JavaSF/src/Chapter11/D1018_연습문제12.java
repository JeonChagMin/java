package Chapter11;

public class D1018_��������12 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));

	}

	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
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
