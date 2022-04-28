package Chapter13;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class D1022_컬렉션연습문제02 {

	public static void main(String[] args) {
		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);
		System.out.print("입력받을 갯수 : ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int a = s.nextInt();
			list.add(a);
		}
		
		printArray(list);

	}

	private static void printArray(List<Integer> list) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(i)>=list.get(j)) {
					result=list.get(i);
				}else {
					result=list.get(j);
				}
			}
		}
		System.out.println("가장 큰 값은 "+result+" 입니다");
		
	}

}
