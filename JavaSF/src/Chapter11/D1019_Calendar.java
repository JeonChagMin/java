package Chapter11;

import java.util.Calendar;

public class D1019_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH);
//		int day = now.get(Calendar.DAY_OF_MONTH);
////		년 월 일을 입력 가능하다.
//
//		int week = now.get(Calendar.DAY_OF_WEEK);
//		String strweek = "";
//		switch (week) {
//		case Calendar.MONDAY:
//			strweek = "월";
//			break;
//		case Calendar.TUESDAY :
//			strweek = "화";
//			break;
//		case Calendar.WEDNESDAY :
//			strweek = "수";
//			break;
//		case Calendar.THURSDAY :
//			strweek = "목";
//			break;
//		case Calendar.FRIDAY :
//			strweek = "금";
//			break;
//		case Calendar.SATURDAY :
//			strweek = "토";
//			break;
//		case Calendar.SUNDAY :
//			strweek = "일";
//			break;
//		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = "";
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println("현재 시간");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.print(second+"초입니다");
	}
}
