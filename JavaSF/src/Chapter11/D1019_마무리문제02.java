package Chapter11;

import java.util.Calendar;

public class D1019_����������02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		int week=c.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch (week) {
		case Calendar.MONDAY :
			strweek="��";
			break;
		case Calendar.TUESDAY :
			strweek="ȭ";
			break;
		case Calendar.WEDNESDAY :
			strweek="��";
			break;
		case Calendar.THURSDAY :
			strweek="��";
			break;
		case Calendar.FRIDAY :
			strweek="��";
			break;
		case Calendar.SATURDAY :
			strweek="��";
			break;
		case Calendar.SUNDAY :
			strweek="��";
			break;
		}
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		System.out.print(year+"�� ");
		System.out.print(month+ "�� ");
		System.out.print(day+"�� ");
		System.out.print(strweek+"���� ");
		System.out.print(hour+"�� ");
		System.out.print(minute+"��");

	}

}
