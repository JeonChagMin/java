package Chapter12;

public class D1021_������ {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId(); // ������ ID ���
		String name = Thread.currentThread().getName(); // ������ �̸� ���
		int priority = Thread.currentThread().getPriority(); // ������ �켱���� �� ���
		Thread.State s = Thread.currentThread().getState(); // ������ ���� �� ���
		Tread thread = new Tread();
		Thread.State n = thread.getState();
		thread.start();
		Thread.State a = thread.getState();
		System.out.println("���� ������ �̸� = " + name);
		System.out.println("���� ������ ID = " + id);
		System.out.println("���� ������ �켱���� �� = " + priority);
		System.out.println("���� ������ ���� = " + s);
		System.out.println("������ ���� = " + n);
		System.out.println("������ ���� = " + a);

	}

}

class Tread extends Thread {
	
	@Override
	public void run() {
		int x = 5;
	}
}
