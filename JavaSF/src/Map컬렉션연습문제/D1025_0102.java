package Map�÷��ǿ�������;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1025_0102 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		map.put("monday", "������");
		map.put("tuseday", "ȭ����");
		map.put("wednesday", "������");
		map.put("thursday", "�����");
		map.put("friday", "�ݿ���");
		map.put("saturday", "�����");
		map.put("sunday", "�Ͽ���");
		while (true) {
			try {
				System.out.print("�߰��ϰ� ���� ����� �ѱ��� �Է��ϼ���");
				String a = s.nextLine();
				String[] b = a.split(",");
				String word[] = new String[b.length];
				for (int i = 0; i < word.length; i++) {
					word[i] = b[i].trim();
				}

				if (word[0].matches(".*[��-����-�Ӱ�-�R]+.*")) {
					System.out.println("ù��°�� ����� �Է����ּ���");
				} else if (word[1].matches(".*a-zA-Z+.*")) {
					System.out.println("�ι�°�� �ѱ۷� �Է����ּ���");
				}

				if (a.equals("�׸�")) {
					break;
				}
			} catch (Exception e) {
			}

		}

		while (true) {
			try {
				System.out.print("ã�� ���� ��� �Է��ϼ��� : ");
				String eng = s.nextLine();
				if (eng.equals("exit")) {
					System.out.println("���α׷� ����");
					break;
				} else if (map.get(eng) == null) {
					throw new Exception();
				} else {
					System.out.println(map.get(eng));
				}
			} catch (Exception e) {
				System.out.println("ã�� �ܾ �����ϴ�.");
			}
		}

	}

}
