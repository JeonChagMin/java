package Chapter02;

public class D0728_Ex02_변수 {

	public static void main(String[] args) {

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		// 띄어쓰기를 한 상태로 출력하기 위해서는 "안에서 미리 해야한다.
		int totalMinute = (hour * 60) + minute;// "가 없는 + 이므로 ()를 쓰지않고 연산이 바로 가능하다.
		System.out.println("총 " + totalMinute + "분");

	}

}
