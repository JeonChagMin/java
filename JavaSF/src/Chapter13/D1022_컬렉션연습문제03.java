package Chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1022_�÷��ǿ�������03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		System.out.print("�Է¹��� ���� �� : ");
		int x= s.nextInt();
		System.out.print("������ �Է����ּ��� : ");
		for (int i = 0; i < x; i++) {
			String word = s.next();
			String word1 =word.toUpperCase();
			if (word1.length()==1) {
				
			char c = word1.charAt(0);
			if (c !='A' && c !='B' && c!='C' && c!='D' && c!='F') {
				System.out.println("�߸��� �Է��� �ֽ��ϴ� �ٽ� �������ּ���");
				break;
			}
			if ( c >='A' && c<='F') {
				list.add(c);
				}
			}
			else {
				System.out.println("�߸��� �Է��� �ֽ��ϴ� �ٽ� �������ּ���");
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
		
		System.out.println("������ �� ���� : "+result+"�Դϴ�.");
		
	}

}
