package MapÄÃ·º¼Ç¿¬½À¹®Á¦;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1025_0102 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		map.put("monday", "¿ù¿äÀÏ");
		map.put("tuseday", "È­¿äÀÏ");
		map.put("wednesday", "¼ö¿äÀÏ");
		map.put("thursday", "¸ñ¿äÀÏ");
		map.put("friday", "±İ¿äÀÏ");
		map.put("saturday", "Åä¿äÀÏ");
		map.put("sunday", "ÀÏ¿äÀÏ");
		while (true) {
			try {
				System.out.print("Ãß°¡ÇÏ°í ½ÍÀº ¿µ¾î¿Í ÇÑ±ÛÀ» ÀÔ·ÂÇÏ¼¼¿ä");
				String a = s.nextLine();
				String[] b = a.split(",");
				String word[] = new String[b.length];
				for (int i = 0; i < word.length; i++) {
					word[i] = b[i].trim();
				}

				if (word[0].matches(".*[¤¡-¤¾¤¿-¤Ó°¡-ÆR]+.*")) {
					System.out.println("Ã¹¹øÂ°´Â ¿µ¾î·Î ÀÔ·ÂÇØÁÖ¼¼¿ä");
				} else if (word[1].matches(".*a-zA-Z+.*")) {
					System.out.println("µÎ¹øÂ°´Â ÇÑ±Û·Î ÀÔ·ÂÇØÁÖ¼¼¿ä");
				}

				if (a.equals("±×¸¸")) {
					break;
				}
			} catch (Exception e) {
			}

		}

		while (true) {
			try {
				System.out.print("Ã£°í ½ÍÀº ¿µ¾î¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String eng = s.nextLine();
				if (eng.equals("exit")) {
					System.out.println("ÇÁ·Î±×·¥ Á¾·á");
					break;
				} else if (map.get(eng) == null) {
					throw new Exception();
				} else {
					System.out.println(map.get(eng));
				}
			} catch (Exception e) {
				System.out.println("Ã£´Â ´Ü¾î°¡ ¾ø½À´Ï´Ù.");
			}
		}

	}

}
