package Chapter11;

import java.util.Scanner;

public class D1018_��������13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer result = new StringBuffer();

		int n[] = new int[26];
		for (int i = 0; i < n.length; i++) {
			n[i]=0;
		}
		
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
		while (true) {
			String sen = s.nextLine();
			if (sen.charAt(0)==';') {
				break;
			}
			result.append(sen);
		}
		
		String word = result.toString().toUpperCase();
//		StringBuffer�� ����ҷ��� toString�� ȣ���� ���� �޼ҵ带 ����ϸ� �ȴ�.
		for (int i = 0; i < word.length(); i++) {
			char ABC = word.charAt(i);
				if (ABC >='A'&& ABC<='Z') {
					int index = (int)(ABC-'A');
					n[index]++;
				}

			}

		System.out.println();
		System.out.println("������׷��� �׸��ϴ�");
		for (int i = 0; i < n.length; i++) {
			System.out.print((char)('A'+i));
			for (int j = 0; j < n[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
