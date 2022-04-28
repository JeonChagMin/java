package Chapter14;

import java.io.FileReader;
import java.io.Reader;

public class D1027_입출력_출력문자예제 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\Temp\\test1.txt");
		char[] buffer = new char[5];
		int readChar = reader.read(buffer, 1, 3);
		if (readChar != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}

	}

}
