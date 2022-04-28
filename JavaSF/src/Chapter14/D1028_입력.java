package Chapter14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class D1028_입력 {

	public static void main(String[] args) throws IOException {
		InputStream ip = new FileInputStream("C:\\Temp\\today.txt");
//		InputStream ip = new FileInputStream(D1028_입력.class.getResource("today.txt").getPath());
//		그 파일이 있는 정확한 경로를 모를때 사용한다.
		InputStreamReader is = new InputStreamReader(ip,"UTF-8");
		BufferedReader br = new BufferedReader(is);
		while (true) {
			String data = br.readLine();
			if (data==null) {
				break;
			}			
			String daTa=data.toUpperCase();
			System.out.println(daTa);
		}
		br.close();
	}

}
