package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1022_컬렉션연습문제01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner s =new Scanner(System.in);
		System.out.print("메뉴는 몇가지 : ");
		int x= s.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print("메뉴를 입력하세요 : ");
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
		System.out.print("가장 긴 이름의 메뉴는 : ");
		System.out.println(list.get(max));
			
		

	}

}
