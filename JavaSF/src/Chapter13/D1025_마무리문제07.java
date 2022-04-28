package Chapter13;

import java.util.ArrayList;
import java.util.List;

public class D1025_付公府巩力07 {

	public static void main(String[] args) {
		List<Board1> list = new ArrayList<Board1>();
		list.add(new Board1("力格1","郴侩1"));
		list.add(new Board1("力格2","郴侩2"));
		list.add(new Board1("力格3","郴侩3"));
		
		for(Board1 b : list) {
			System.out.println(b.getTitle()+" - "+ b.getContent());
		}

	}

}

class Board1 {
	private String title;
	private String content;
	
	Board1( String t, String c){
		title=t;
		content=c;
	}
	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}

class BoardDao {
	List<Board1> list = new ArrayList<Board1>();

}
