package Map컬렉션연습문제;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1025_0102 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		map.put("monday", "월요일");
		map.put("tuseday", "화요일");
		map.put("wednesday", "수요일");
		map.put("thursday", "목요일");
		map.put("friday", "금요일");
		map.put("saturday", "토요일");
		map.put("sunday", "일요일");
		while (true) {
			try {
				System.out.print("추가하고 싶은 영어와 한글을 입력하세요");
				String a = s.nextLine();
				String[] b = a.split(",");
				String word[] = new String[b.length];
				for (int i = 0; i < word.length; i++) {
					word[i] = b[i].trim();
				}

				if (word[0].matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
					System.out.println("첫번째는 영어로 입력해주세요");
				} else if (word[1].matches(".*a-zA-Z+.*")) {
					System.out.println("두번째는 한글로 입력해주세요");
				}

				if (a.equals("그만")) {
					break;
				}
			} catch (Exception e) {
			}

		}

		while (true) {
			try {
				System.out.print("찾고 싶은 영어를 입력하세요 : ");
				String eng = s.nextLine();
				if (eng.equals("exit")) {
					System.out.println("프로그램 종료");
					break;
				} else if (map.get(eng) == null) {
					throw new Exception();
				} else {
					System.out.println(map.get(eng));
				}
			} catch (Exception e) {
				System.out.println("찾는 단어가 없습니다.");
			}
		}

	}

}
