package Chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class D1028_printStream {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		Writer writer = new FileWriter("C:\\Temp\\printStream.txt",true);
		PrintWriter pw = new PrintWriter(writer);
		System.out.println("����");
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			String word = s.nextLine();
			pw.println(word);
			if (word.equals("")) {
				System.out.println("�ý�������");
				break;
			}
			
		}
		pw.flush();
		pw.close();
	}
}
