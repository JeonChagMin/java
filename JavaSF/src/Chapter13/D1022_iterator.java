package Chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class D1022_iterator {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));

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

