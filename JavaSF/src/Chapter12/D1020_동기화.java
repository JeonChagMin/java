package Chapter12;

public class D1020_µø±‚»≠ {

	public static void main(String[] args) {
		ASDCS d =new ASDCS();
		Thread1 thread1 = new Thread1(); 
		thread1.setD(d);
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.setD(d);
		thread2.start();
		
	}

}
class Thread1 extends Thread{
	ASDCS d = new ASDCS();
	void setD(ASDCS d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		d.setScore(5);
	}
}

class Thread2 extends Thread {
	ASDCS d = new ASDCS();
	
	void setD(ASDCS d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		d.setScore(7);
	}
}


class ASDCS {
	int score;
	int result;
	ASDCS() {
	}
	
	int getResult() {
		return result;
	}
	
	synchronized void setScore(int s) {
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
		}
		this.score = s;
		this.result =score*score;
		System.out.println(result);
	}
}
