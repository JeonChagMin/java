
public class D0903_5조 {

	public static void main(String[] args) {
		int[][] ar = new int[2][10];
//		랜덤값 1~100까지 숫자를 2차원 배열 1행에는 "오름차순"
//		2행에는 "내림차순"
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
//		for (int i = 0; i < ar[0].length; i++) {
//			for (int j = i+1; j < ar[0].length; j++) {
//				if (ar[0][i] >= ar[0][j]) {
//					int imsi = ar[0][i];
//					ar[0][i] = ar[0][j];
//					ar[0][j] = imsi;
//				}
//			}
//			System.out.print(ar[0][i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < ar[0].length; i++) {
//			for (int j = i+1; j < ar[1].length; j++) {
//				if (ar[1][i] <= ar[1][j]) {
//					int imsi = ar[1][i];
//					ar[1][i] = ar[1][j];
//					ar[1][j] = imsi;
//				}
//			}
//			System.out.print(ar[1][i] + " ");
//		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int z = j+1; z < ar[i].length; z++) {
					if (i == 0) {
						if (ar[i][j] > ar[i][z]) {
							int imsi = ar[i][j];
							ar[i][j] = ar[i][z];
							ar[i][z] = imsi;
						}
					} else if (i == 1) {
						if (ar[i][j] < ar[i][z]) {
							int imsi = ar[i][j];
							ar[i][j] = ar[i][z];
							ar[i][z] = imsi;
//			반복 횟수만 늘어나는 경우가 나오게 됩니다.
						}
					}
				}
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
