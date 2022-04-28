package Chapter13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class D1025_Set {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
//		System.out.println("총 객체 수 : "+set.size());
		
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		
//		System.out.println(m1.equals(m2));
//		System.out.println(m1==m2);
//		그냥 == 은 참조값으로 비교 하는 것이기 때문에 false 가 나온다.
		
		List<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("가");
		list.add("나");
//		for ( String n : list) {
//			System.out.println(n);
//		}
		
		Set<String> s = new HashSet<String>(list);
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String n =it.next();
			System.out.print(n);
		}
		
		System.out.println();
		Set<String> sa = new HashSet<String>(list);
		Iterator<String> it1 = sa.iterator();
		while(it1.hasNext()) {
			String n =it1.next();
			System.out.print(n);
		}
		
		
	}

}

class Member {
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name)&& (member.age==age);
//			이름과 나이가 같으면 같은 것으로 본다.
		} else {
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
//		name 은 String 이고 String 의 hashcode는 같으면 hashcode도 같기 때문에 name.hashcode를 사용한다.
	}
}