package Chapter14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class D1027_입출력_출력예제 {

	public static void main(String[] args) throws Exception {
		OutputStream op = new FileOutputStream("C:/Temp/test.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		op.write(a);
		op.write(b);
		op.write(c);
		
		op.flush();
		op.close();

	}

}
