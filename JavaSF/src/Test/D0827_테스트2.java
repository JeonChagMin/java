package Test;

public class D0827_테스트2 {
	
	

	public static void main(String[] args) {

//		문제13
		int[] num = new int[20];
		int[] rank = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 4000) - 2000;
		}
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					rank[i]++;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 값 : " + num[i] + ", 순위 : " + rank[i]);
			for (int j = 0; j <= 20-rank[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
