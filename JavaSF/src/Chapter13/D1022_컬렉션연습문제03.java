package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1022_컬렉션연습문제03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		System.out.print("입력받을 과목 수 : ");
		int x= s.nextInt();
		System.out.print("학점을 입력해주세요 : ");
		for (int i = 0; i < x; i++) {
			String word = s.next();
			String word1 =word.toUpperCase();
			if (word1.length()==1) {
				
			char c = word1.charAt(0);
			if (c !='A' && c !='B' && c!='C' && c!='D' && c!='F') {
				System.out.println("잘못된 입력이 있습니다 다시 실행해주세요");
				break;
			}
			if ( c >='A' && c<='F') {
				list.add(c);
				}
			}
			else {
				System.out.println("잘못된 입력이 있습니다 다시 실행해주세요");
			}
			
		}
if (list.size()==x) {
	
		printArray(list);
		}

		
	}

	private static void printArray(List<Character> list) {
		int result=0;
		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 'A':
				result+=4;
				break;
				
			case 'B':
				result += 3;
				break;
				
			case 'C' :
				result +=2;
				break;
				
			case 'D' : 
				result += 1;
				break;
				
			case 'F' :
				result +=0;
				break;
			}
				
		}
		
		System.out.println("학점의 총 합은 : "+result+"입니다.");
		
	}

}
