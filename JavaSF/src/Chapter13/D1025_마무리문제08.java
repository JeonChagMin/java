package Chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D1025_����������08 {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<Student1>();
		
		set.add(new Student1(1,"ȫ�浿"));
		set.add(new Student1(2,"ȫ��"));
		set.add(new Student1(1,"���ο�"));
		
		Iterator<Student1> it = set.iterator();
		while (it.hasNext()) {
			Student1 student = it.next();
			System.out.println(student.studentNum+" : "+student.name);
		}

	}

}

class Student1{
	int studentNum;
	String name;
	
	Student1 ( int s , String n) {
		studentNum=s;
		name=n;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1) {
			Student1 s = (Student1) obj;
			if (((Student1) obj).studentNum==studentNum) {
			return true;
			}
		}
		return false;
	}
	
}
