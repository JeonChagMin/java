package Test;

public class D0830_�׽�Ʈ4 {

	public static void main(String[] args) {

//		����16��
//		ar�迭 10�� br�迭 10��
//		ar�� br �� ������ cr�� �ִ´�.
//		cr�迭 ������������ ����

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
//		index �� ���� �߰��Ѱ�
		while (ci < cr.length) {
			if (ar[ai] >= br[bi]) {
				cr[ci++] = br[bi++];
//		index�� �������� �ʴ� ������ �� ����, ci�� �ι� �����Ҷ� ai, bi �� �ѹ��� �����ϱ� ������		
				if (bi >= br.length) {
					br[--bi] = 101;
				}
//		ai�� bi �迭 �� �� ���� ���ڸ� �� ���� ��� ������ �Ѱ��� ���� ����� ������� ������ ����� ������ֱ� ���� ���ڸ� �߰��Ѵ�.		
//		�׷��� ����� �Ҷ� �⺻ ���� ��� ���ؼ��� �߰��ϱ� ���� ���� ����ؾ��Ѵ�.
			} else {
				cr[ci++] = ar[ai++];
				if (ai >= ar.length) {
					ar[--ai] = 101;
				}
			}
		}

		System.out.println("���� �� �� ar");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("���� �� �� br");
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
