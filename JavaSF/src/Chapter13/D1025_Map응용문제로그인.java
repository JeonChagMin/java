package Chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1025_Map응용문제로그인 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Spring", "1234");
		map.put("Summer", "123");
		map.put("fall", "12");
		map.put("winter", "1");

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = s.nextLine();
			System.out.print("비밀번호 : ");
			String pass = s.nextLine();
			System.out.println();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pass)) {
					System.out.println("로그인 되었습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다");
			}
		}

	}

}
