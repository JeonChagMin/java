package Chapter14;

import java.io.FileInputStream;
import java.io.InputStream;

public class D1027_입출력_입력예제 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.db");
		
		while (true) {
			int data = is.read();
			if (data==-1) {
				break;
			}
			System.out.println(data);
		}
		is.close();

	}

}
