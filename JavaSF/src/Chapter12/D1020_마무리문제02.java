package Chapter12;

public class D1020_����������02 {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();

	}

}

class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("�������� ����մϴ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
}

class MusicRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("������ ����մϴ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
}
