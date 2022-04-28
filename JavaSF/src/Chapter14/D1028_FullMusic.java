package Chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class D1028_FullMusic {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
//		while (true) {
//			try {
//			System.out.println("파일명");
//			String word = s.nextLine();
//			if (word.length() == 0) {
//				System.out.println("시스템 종료");
//				break;
//			}
			InputStream is = new FileInputStream("C:\\Temp\\file1.txt");
			Reader reader = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(reader);

//			Writer writer = new FileWriter("C:\\Temp\\Fullmusic.txt", true);

			while (true) {
				String aaa = br.readLine();
				if (aaa == null) {
					break;
				}
				System.out.println(aaa);
//				writer.write(aaa);
//				writer.write("\r\n", 0, 2);
			}
//			writer.write("\r\n", 0, 2);
//			br.close();
//			writer.flush();
//			writer.close();
//			}catch(Exception e){
//				System.out.println("찾는 파일이 없습니다");
//			}

		}
	}

//}
