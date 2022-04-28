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
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		
//		System.out.println("�� ��ü �� : "+set.size());
		
		Member m1 = new Member("ȫ�浿", 30);
		Member m2 = new Member("ȫ�浿", 30);
		
//		System.out.println(m1.equals(m2));
//		System.out.println(m1==m2);
//		�׳� == �� ���������� �� �ϴ� ���̱� ������ false �� ���´�.
		
		List<String> list = new ArrayList<String>();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
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
//			�̸��� ���̰� ������ ���� ������ ����.
		} else {
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
//		name �� String �̰� String �� hashcode�� ������ hashcode�� ���� ������ name.hashcode�� ����Ѵ�.
	}
}