package Chapter11;

import java.util.Calendar;

public class D1019_마무리문제02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		int week=c.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch (week) {
		case Calendar.MONDAY :
			strweek="월";
			break;
		case Calendar.TUESDAY :
			strweek="화";
			break;
		case Calendar.WEDNESDAY :
			strweek="수";
			break;
		case Calendar.THURSDAY :
			strweek="목";
			break;
		case Calendar.FRIDAY :
			strweek="금";
			break;
		case Calendar.SATURDAY :
			strweek="토";
			break;
		case Calendar.SUNDAY :
			strweek="일";
			break;
		}
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		System.out.print(year+"년 ");
		System.out.print(month+ "월 ");
		System.out.print(day+"일 ");
		System.out.print(strweek+"요일 ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분");

	}

}
