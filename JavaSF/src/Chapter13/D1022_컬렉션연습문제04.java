package Chapter13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class D1022_�÷��ǿ�������04 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		while (true) {
			
		System.out.println("�������� �Է����ּ���");
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
		System.out.println("�� �������� ���� : "+result/list.size());
		
	}

	private static void printArray(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"�ϳ� ������ : "+list.get(i));
		}
		
	}

}
