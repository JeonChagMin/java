package Chapter06;

public class D0907_Ŭ����3_����������03 {

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
//		this.writer="�α����� ȸ�����̵�";
//		this.date="���� ��ǻ�� ��¥";
//		this.hitcount=0;
		this(title, content, "�α����� ȸ�����̵�", "������ǻ�ͳ�¥", 0);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "�α�����", 0);
	}
	Board(String title, String content, String writer, String date, int hitcount){
		title= title;
		content= content;
		writer=writer;
		date=date;
		hitcount=hitcount;
		
	}

	
}
