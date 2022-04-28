package 기본GUI연습문제;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex06 extends JFrame {
	JLabel j = new JLabel("Java");
	JPanel jp = new JPanel();

	Ex06() {
		setTitle("+,-로 레이블 크기 조절");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.add(jp);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyChar();
				int size = j.getFont().getSize();
				switch (key) {
				case '+': 
					size+=5;
					j.setFont(new Font("Arial",Font.PLAIN,size));
					break;
				case '-' :
					size-=5;
					j.setFont(new Font("Arial",Font.PLAIN,size));
					break;
				}
			}
		});
		
		
		jp.add(j);
		setSize(500,500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		

	}

	public static void main(String[] args) {
		new Ex06();
	}
}
