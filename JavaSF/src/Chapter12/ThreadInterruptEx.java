package Chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	ThreadInterruptEx() {
		setTitle("Ÿ�̸�"); // ���α׷� �̸�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // ������ ����
		c.add(timerLabel);

		// ��ư�� �����ϰ� Action ������ ���
		// ��ư �̸� �Է� ����
		JButton btn1 = new JButton("PAUSE");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.suspend();
//				th.pause();
				JButton btn1 = (JButton) e.getSource();
			}
		});

		JButton btn2 = new JButton("PLAY");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.resume();
//				th.play();
				JButton btn2 = (JButton) e.getSource();
			}
		});

		JButton btn = new JButton("STOP");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // Ÿ�̸� ������ ���� ����
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false); // ��ư ��Ȱ��ȭ
				btn1.setEnabled(false);
				btn2.setEnabled(false);
			}
		});

		c.add(btn2);
		c.add(btn1);
		c.add(btn);
		setSize(350, 200);
		setVisible(true);
		th.start(); // ������ ���۽�Ŵ
	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}

class TimerRunnable implements Runnable {
	private JLabel timerLabel;

	TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1�� ���� ���� �ܴ�.
			} catch (InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

//class Work extends Thread {
//	private JLabel timerLabel;
//	
//	Work(JLabel timerLabel) {
//		this.timerLabel = timerLabel;
//	}
//	
//	public Work() {
//	}
//
//	public synchronized void play() {
//		try {
//			timerLabel.notify();
//
//		} catch (Exception e) {
//		}
//	}
//
//	public synchronized void pause() {
//		try {
//			timerLabel.wait();
//		} catch (Exception e) {
//		}
//	}
//
//}