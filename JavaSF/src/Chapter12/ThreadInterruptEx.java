package Chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	ThreadInterruptEx() {
		setTitle("타이머"); // 프로그램 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // 스레드 생성
		c.add(timerLabel);

		// 버튼을 생성하고 Action 리스너 등록
		// 버튼 이름 입력 과정
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
				th.interrupt(); // 타이머 스레드 강제 종료
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false); // 버튼 비활성화
				btn1.setEnabled(false);
				btn2.setEnabled(false);
			}
		});

		c.add(btn2);
		c.add(btn1);
		c.add(btn);
		setSize(350, 200);
		setVisible(true);
		th.start(); // 스레드 동작시킴
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
				Thread.sleep(1000); // 1초 동안 잠을 잔다.
			} catch (InterruptedException e) {
				return; // 예외가 발생하면 스레드 종료
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