package Chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1025_Map���빮���α��� {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Spring", "1234");
		map.put("Summer", "123");
		map.put("fall", "12");
		map.put("winter", "1");

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = s.nextLine();
			System.out.print("��й�ȣ : ");
			String pass = s.nextLine();
			System.out.println();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pass)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�");
			}
		}

	}

}
