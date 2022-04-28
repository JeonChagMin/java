package Chapter13;

import java.util.List;
import java.util.Vector;

public class D1022_vector {

	public static void main(String[] args) {
		List<Name> list = new Vector<Name>();
		ThreadA thread1 = new ThreadA(list);
		ThreadB thread2 = new ThreadB(list);
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		list.get(0);
		
		

	}

}

class Name {
	String name;
	Name(String n ) {
		name = n;
	}
	
	@Override
	public String toString() {
		return name;
	}
}


class ThreadA extends Thread {
	List<Name> list;
	
	ThreadA ( List<Name> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		list.add(new Name("1¹ø"));
		
	}
}

class ThreadB extends Thread {
	List<Name> list;
	
	ThreadB(List<Name> list) {
		this.list = list;
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		list.add(new Name("2¹ø"));
	}
}