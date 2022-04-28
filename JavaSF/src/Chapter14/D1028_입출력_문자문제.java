package Chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class D1028_입출력_문자문제 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:\\Temp\\String.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		while (true) {
			String word =s.nextLine();
			writer.write(word);
			if (word.equals("")) {
				break;
			}
		}
		writer.flush();
		writer.close();

	}

}
