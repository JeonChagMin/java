package Chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1019_����������01 {

	public static void main(String[] args) {
		Date d = new Date();
//		2024 05 08 ghk 10 30
		SimpleDateFormat day = new SimpleDateFormat("2024�� 05�� 08�� ȭ���� 10�� 30��");
		String str = day.format(d);
		System.out.println(str);

	}

}
