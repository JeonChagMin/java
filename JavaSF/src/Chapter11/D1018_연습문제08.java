package Chapter11;

import java.util.Scanner;

public class D1018_��������08 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print(">> ");
		StringBuffer sb = new StringBuffer(s.nextLine());
		while (true) {

			try {
				System.out.print("��� : ");
				String word = s.next();
				if (word.equals("�׸�")) {
					System.out.print("�����մϴ�");
					break;
				}
				String a[] = word.split("!");
				sb.replace(sb.indexOf(a[0]), sb.indexOf(a[0])+a[0].length(), a[1]);
				System.out.println(sb);
			} catch (Exception e) {
				System.out.println("ã�� �� �����ϴ�!");
			}
			
		}

	}

}
