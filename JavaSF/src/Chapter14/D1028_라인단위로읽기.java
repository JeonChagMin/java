package Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class D1028_���δ������б� {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader(D1028_���δ������б�.class.getResource("language.txt").getPath());
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
