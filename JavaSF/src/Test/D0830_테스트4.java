package Test;

public class D0830_테스트4 {

	public static void main(String[] args) {

//		문제16번
//		ar배열 10개 br배열 10개
//		ar와 br 중 작은걸 cr로 넣는다.
//		cr배열 오름차순으로 정렬

		int[] ar = new int[10];
		int[] br = new int[10];
		int[] cr = new int[ar.length + br.length];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100) + 1;
			br[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					int imsi = ar[i];
					ar[i] = ar[j];
					ar[j] = imsi;
				}
			}
		}
		for (int i = 0; i < br.length; i++) {
			for (int j = i + 1; j < br.length; j++) {
				if (br[j] < br[i]) {
					int imsi1 = br[i];
					br[i] = br[j];
					br[j] = imsi1;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		}
		System.out.println();

		int ai = 0, bi = 0, ci = 0;
//		index 를 따로 추가한거
		while (ci < cr.length) {
			if (ar[ai] >= br[bi]) {
				cr[ci++] = br[bi++];
//		index가 오버하지 않는 이유는 참 거짓, ci가 두번 증가할때 ai, bi 는 한번씩 증가하기 때문에		
				if (bi >= br.length) {
					br[--bi] = 101;
				}
//		ai와 bi 배열 중 한 쪽의 숫자를 다 썼을 경우 나머지 한개를 비교할 대상이 사라지기 때문에 대상을 만들어주기 위해 숫자를 추가한다.		
//		그래서 출력을 할때 기본 값을 얻기 위해서는 추가하기 전에 값을 출력해야한다.
			} else {
				cr[ci++] = ar[ai++];
				if (ai >= ar.length) {
					ar[--ai] = 101;
				}
			}
		}

		System.out.println("변형 된 후 ar");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("변형 된 후 br");
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i] + " ");
		}
//		for (int i = 0; i < 100; i++) {
//		int st = (int)(Math.random()*9);
//		int en = (int)(Math.random()*9);
//		int imsi=ar[st];
//		ar[st]=ar[en];
//		ar[en]=imsi;
//	}

	}

}
