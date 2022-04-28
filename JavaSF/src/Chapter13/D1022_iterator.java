package Chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class D1022_iterator {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

//		list.remove(2);
//		list.remove(3);
		
		Iterator<Board> it = list.iterator();
		while (it.hasNext()) {
			Board b = it.next();
			System.out.println(b);
		} 
//		for(Board s : list) {
//			System.out.println(s.toString());
//		}
		
		
		
	}


}

class Board {
	String subject;
	String content;
	String wirter;
	
	Board(String s, String c, String w) {
		subject =s;
		content = c;
		wirter = w;
	}
	
	@Override
	public String toString() {
		return subject+" "+content+ " "+ wirter;
	}
}

