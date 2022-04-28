import java.util.Scanner;

public class Exam_bakjoon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int play = s.nextInt();
		for (int i = 0; i < play; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int[][] house = new int[a + 1][14];
			for (int j = 0; j < house.length; j++) {
				for (int j2 = 0; j2 < 14; j2++) {
					if (j == 0) {
						house[j][j2] = j2 + 1;
					}
					if (j2 == 0) {
						house[j][j2] = 1;
					}
					if (j2 > 0 && j>0) {
						house[j][j2] = house[j - 1][j2] + house[j][j2 - 1];
					}
				}

			}
			System.out.println(house[a][b-1]);

		}

	}

}
