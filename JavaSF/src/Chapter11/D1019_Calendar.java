package Chapter11;

import java.util.Calendar;

public class D1019_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH);
//		int day = now.get(Calendar.DAY_OF_MONTH);
////		�� �� ���� �Է� �����ϴ�.
//
//		int week = now.get(Calendar.DAY_OF_WEEK);
//		String strweek = "";
//		switch (week) {
//		case Calendar.MONDAY:
//			strweek = "��";
//			break;
//		case Calendar.TUESDAY :
//			strweek = "ȭ";
//			break;
//		case Calendar.WEDNESDAY :
//			strweek = "��";
//			break;
//		case Calendar.THURSDAY :
//			strweek = "��";
//			break;
//		case Calendar.FRIDAY :
//			strweek = "��";
//			break;
//		case Calendar.SATURDAY :
//			strweek = "��";
//			break;
//		case Calendar.SUNDAY :
//			strweek = "��";
//			break;
//		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = "";
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println("���� �ð�");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"�� ");
		System.out.print(minute+"�� ");
		System.out.print(second+"���Դϴ�");
	}
}
