package Chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1019_마무리문제01 {

	public static void main(String[] args) {
		Date d = new Date();
//		2024 05 08 ghk 10 30
		SimpleDateFormat day = new SimpleDateFormat("2024년 05월 08일 화요일 10시 30분");
		String str = day.format(d);
		System.out.println(str);

	}

}
