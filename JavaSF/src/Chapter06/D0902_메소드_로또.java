package Chapter06;

public class D0902_메소드_로또 {

	public static void main(String[] args) {

		int[] ar = new int[45];
		int[] br = new int[6];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i+1;
		}
		br = calc(ar);

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		}
	}

	private static int[] calc(int[] ar) {
		for (int i = 0; i < 2000; i++) {
			int st = (int) (Math.random() * 45);
			int ed = (int) (Math.random() * 45);
			int imsi = ar[st];
			ar[st] = ar[ed];
			ar[ed] = imsi;
		}
		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = ar[i];
//		}
		System.arraycopy(ar, 0, lotto, 0, lotto.length);
		return lotto;
	}

}
