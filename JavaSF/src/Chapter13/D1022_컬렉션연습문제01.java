package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1022_�÷��ǿ�������01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner s =new Scanner(System.in);
		System.out.print("�޴��� ��� : ");
		int x= s.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print("�޴��� �Է��ϼ��� : ");
			String menu = s.next();
			list.add(menu);
		}
		
		for ( String n : list) {
			System.out.println(n);
		}
		int max =0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(i).length()>=list.get(j).length()) {
					max =i;
				}else {
					max=j;
				}
			}
		}
		System.out.print("���� �� �̸��� �޴��� : ");
		System.out.println(list.get(max));
			
		

	}

}
