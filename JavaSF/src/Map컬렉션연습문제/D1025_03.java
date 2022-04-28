package MapÄÃ·º¼Ç¿¬½À¹®Á¦;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class D1025_03 {

	public static void main(String[] args) {

		Map<String, Student1> map = new HashMap<String, Student1>();
		Scanner s = new Scanner(System.in);

		while (true) {
			String name = "";
			String id = "";
			int num = 0;
			while (true) {
				try {
					System.out.print("ÇÐ»ý ÀÌ¸§ : ");
					name = s.nextLine();
					for (int i = 0; i < name.length(); i++) {
						if (name.valueOf(name.charAt(i)).matches("[^a-zA-Z°¡-ÆR\\s]")) {
							throw new InterruptedException();
						} else if (name.charAt(i) == ' ') {
							throw new Exception();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("¿µ¹®°ú ÇÑ±ÛÀ» Á¦´ë·Î ÀÔ·ÂÇØÁÖ¼¼¿ä");
				} catch (Exception e) {
					System.out.println("¶ç¾î¾²±â¸¦ ÇÏÁö¸»¾ÆÁÖ¼¼¿ä");
				}
			}
			if (name.equals("±×¸¸")) {
				break;
			}
			while (true) {
				try {
					System.out.print("ÇÐ»ý id : ");
					id = s.nextLine();
					for (int i = 0; i < id.length(); i++) {

						if (id.charAt(i) == ' ') {
							throw new InterruptedException();
						}
					}
					break;
				} catch (InterruptedException e) {
					System.out.println("¶ç¾î¾²±â¸¦ ÇÏÁö ¸»¾ÆÁÖ¼¼¿ä");
				}
			}
			while (true) {
				try {
					System.out.print("ÇÐ»ý ¹øÈ£ : ");
					num = s.nextInt();
					s.nextLine();
					break;
				} catch (InputMismatchException e) {
					System.out.println("¼ýÀÚ¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä");
					s.next();
				}

			}
			map.put(name, new Student1(id, num));
		}

		while (true) {
			System.out.print("Ã£°í ½ÍÀº ÇÐ»ýÀÇ ÀÌ¸§ : ");
			String name1 = "";
			try {
				name1 = s.nextLine();
				if (name1.equals("±×¸¸")) {
					System.out.println("ÇÁ·Î±×·¥ Á¾·á");
					break;
				}
				for (int i = 0; i < name1.length(); i++) {
					if (name1.valueOf(name1.charAt(i)).matches("[^a-zA-Z°¡-ÆR\\s]")) {
						throw new InterruptedException();
					} else if (name1.charAt(i) == ' ') {
						throw new Exception();
					}
				}
			} catch (InterruptedException e) {
				System.out.println("¿µ¹®°ú ÇÑ±ÛÀ» Á¦´ë·Î ÀÔ·ÂÇØÁÖ¼¼¿ä");
			} catch (Exception e) {
				System.out.println("¶ç¾î¾²±â¸¦ ÇÏÁö¸»¾ÆÁÖ¼¼¿ä");
			}
			if (map.containsKey(name1)) {
				System.out.println(name1);
				System.out.println("ÇÐ»ýÀÇ ID : " + map.get(name1).getId());
				System.out.println("ºñ¹Ð¹øÈ£ : " + map.get(name1).getNum());
			} else {
				System.out.println("ÇÐ»ýÀÇ ÀÌ¸§À» ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä");
			}
		}
	}

}

class Student1 {
	private String id;
	private int num;

	Student1(String na, int n) {
		id = na;
		num = n;
	}

	public String getId() {
		return id;
	}

	public int getNum() {
		return num;
	}
}