package 기본GUI연습문제;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 extends JFrame {
	StringBuffer s = new StringBuffer("Love Java");
	JLabel j = new JLabel(s.toString());

	Ex03() {
		setTitle("방향키 리스너");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_LEFT:
					String word = s.reverse().toString();
					j.setText(word);
					break;

				}
			}
		});

		j.setLocation(100, 100);
		j.setSize(300, 150);
		c.add(j);

		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		new Ex03();
	}
}
