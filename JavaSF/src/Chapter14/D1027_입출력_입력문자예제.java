package Chapter14;

import java.io.FileWriter;
import java.io.Writer;

public class D1027_�����_�Է¹��ڿ��� {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Temp\\test1.txt");
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();

	}

}
