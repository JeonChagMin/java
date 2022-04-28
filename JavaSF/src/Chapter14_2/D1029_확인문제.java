package Chapter14_2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class D1029_확인문제 {

	public static void main(String[] args) throws IOException {
		D1029_확인문제 d = new D1029_확인문제();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println(" 1. 목록보기 | 2. 상세보기 | 3. 수정하기 | 4. 삭제하기 | 5. 생성하기 | 6. 종료 ");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 : ");
			int x = s.nextInt();
			if (x>=1 && x<=6) {
				
			switch (x) {

			case 1:
				d.list();
				break;
			case 2:
				d.see();
				break;
			case 3:
				d.change();
				break;
			case 4:
				d.dele();
				break;
			case 5:
				d.made();
				break;

			case 6:
				System.out.println("시스템 종료");
				System.exit(0);

			}
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

	void list() {
		File list = new File("C:\\Temp");
		File[] f = list.listFiles();
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("------------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : f) {
			System.out.print(sdf.format(file.lastModified()));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

	void see() {
		Scanner s = new Scanner(System.in);
		System.out.print("상세보기 할 파일 이름을 입력하세요");
		String name = s.nextLine();
		try {
			InputStream is = new FileInputStream("C:\\Temp\\" + name);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("일치하는 파일 이름이 없습니다");
		}

	}

	void change() {
		Scanner s = new Scanner(System.in);
		System.out.println("수정 하고 싶은 파일을 입력하세요");
		System.out.print("이름 : ");
		String name = s.nextLine();
		while (true) {
			
		System.out.print("입력 : ");
		String ch = s.nextLine();
		if (ch.equals("+") || ch.equals("-")) {
			
		try {

			switch (ch) {
			case "+":
				Writer writer = new FileWriter("C:\\Temp\\" + name, true);
				System.out.println("이어쓰고 싶은 내용을 입력하세요 : 그만이라고 입력시 종료");
				System.out.print("입력 : ");
				while (true) {
					String word = s.nextLine();
					if (word.equals("그만")) {
						System.out.println("입력종료");
						break;
					}
					writer.write(word);
					writer.write("\r\n",0,2);
				}
				writer.flush();
				writer.close();
				System.exit(0);

			case "-":
				Writer writer1 = new FileWriter("C:\\Temp\\" + name);
				System.out.println("새로 쓰고 싶은 내용을 입력하세요 : 그만이라고 입력시 종료");
				System.out.print("입력 : ");
				while (true) {
					String word = s.nextLine();
					if (word.equals("그만")) {
						System.out.println("입력종료");
						break;
					}
					writer1.write(word);
					writer1.write("\r\n",0,2);
				}

				writer1.flush();
				writer1.close();
				System.exit(0);
			}

		} catch (Exception e) {
			System.out.println("일치하는 파일 이름이 없습니다.");
		}
		} else {
			System.out.println("다시 입력해주세요");
		}
		}
	}

	void dele() {
		Scanner s = new Scanner(System.in);
		System.out.println("삭제하고싶은 파일의 이름을 입력하세요");
		System.out.print("입력 : ");
		String name = s.nextLine();
		try {
			File file = new File("C:\\Temp\\" + name);
			file.delete();
			System.out.println("파일을 삭제하였습니다");

		} catch (Exception e) {
			System.out.println("파일이 존재하지 않습니다");
		}

	}

	void made() throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("만들고자 하는 파일의 이름을 입력하세요");
		System.out.print("이름 : ");
		String name = s.nextLine();
		File file = new File("C:\\Temp\\" + name);
		if (file.exists()) {
			System.out.println("이미 존재하는 파일입니다");
		} else {
			file.createNewFile();
		}

	}

}
