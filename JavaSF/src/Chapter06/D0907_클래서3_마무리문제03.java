package Chapter06;

public class D0907_클래서3_마무리문제03 {

	public static void main(String[] args) {

	}

}

class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	Board(String title, String content) {
//		this.title = title;
//		this.content=content;
//		this.writer="로그인한 회원아이디";
//		this.date="현재 컴퓨터 날짜";
//		this.hitcount=0;
		this(title, content, "로그인한 회원아이디", "현재컴퓨터날짜", 0);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "로그인한", 0);
	}
	Board(String title, String content, String writer, String date, int hitcount){
		title= title;
		content= content;
		writer=writer;
		date=date;
		hitcount=hitcount;
		
	}

	
}
