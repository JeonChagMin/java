package Chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class D1028_�����_���ڹ��� {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:\\Temp\\String.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
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
