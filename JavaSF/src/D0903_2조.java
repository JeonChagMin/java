import java.util.Scanner;

public class D0903_2조 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int studentNum = 0;
			int[] scores = null;

				System.out.println("----------------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("----------------------------------------------------");
//				int selectNo = Integer.parseInt(scanner.nextLine());
//				int selectNo = scanner.nextInt();

				// 이걸쓰면 왜 다른걸 scanner.nextInt 를 쓸수 없는가
//				nextLine은 띄어쓰기도 읽기 때문에 nextInt 를 쓸 수 없다.	
					System.out.print("학생수 > ");
//					studentNum = Integer.parseInt(scanner.nextLine());
					studentNum = scanner.nextInt();
					scores = new int[studentNum];
					for (int i = 0; i < studentNum; i++) {
						System.out.print("scores[" + i + "] >");
//						scores[i] = Integer.parseInt(scanner.nextLine());
						scores[i] = scanner.nextInt();
					}
					System.out.println();
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "] > " + scores[i]);
						System.out.println();
					}
					int sum = 0;
					int max = 0;
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if (max <= scores[i]) {
							max = scores[i];
						}

					}
					System.out.println();
					double ave = (double) sum / scores.length;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + ave);

			System.out.println("프로그램 종료");

		}

	}