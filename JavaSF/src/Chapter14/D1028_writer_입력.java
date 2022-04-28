package Chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class D1028_writer_ют╥б {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:\\Temp\\print.txt");
		BufferedReader br = new BufferedReader(reader);
		while (true) {
		String data = br.readLine();
		if (data==null) {
			break;
		}
		System.out.println(data);
		}
		br.close();
	}

}
