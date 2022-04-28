package Chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public class D1028_입출력_문자문제출력 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:\\Temp\\String.txt");
		char[] buffer = new char[5];

		while (true) {
			int readBuffer = reader.read(buffer);
			if (readBuffer == -1) {
				break;
			}
			for (int i = 0; i < readBuffer; i++) {
				System.out.println(buffer[i]);

			}
		}
		reader.close();

	}

}
