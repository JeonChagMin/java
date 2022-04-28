package Chapter13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class D1022_컬렉션연습문제04 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		while (true) {
			
		System.out.println("강수량을 입력해주세요");
		int x = s.nextInt();
		if (x ==0) {
			break;
		}
		list.add(x);
		}
		printArray(list);
		
		int result=0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
		result+=it.next();
		}
		System.out.println("총 강수량의 값은 : "+result/list.size());
		
	}

	private static void printArray(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"일날 강수량 : "+list.get(i));
		}
		
	}

}
