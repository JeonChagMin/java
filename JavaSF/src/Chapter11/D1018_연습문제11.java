package Chapter11;

public class D1018_연습문제11 {

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}

	public static void printGraph(int[] n, char ch) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(n[i]);
		}
	}

}

