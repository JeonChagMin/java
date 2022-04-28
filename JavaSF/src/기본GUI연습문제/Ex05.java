package 기본GUI연습문제;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex05 extends JFrame {

	JLabel j = new JLabel("Love Java");
	JPanel jp = new JPanel();
	
	Ex05() {
		setTitle("마우스 휠 라벨 크키조절");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		j.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int size = j.getFont().getSize();
				int n = e.getWheelRotation();
				if (n<0) {
					size+=5;
					j.setFont(new Font("Arial",Font.PLAIN,size));
				} else {
					size-=5;
					j.setFont(new Font("Arial",Font.PLAIN,size));
				}
			}
		});
		jp.add(j);
		c.add(jp);
		setSize(500,500);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

	}

	public static void main(String[] args) {
		new Ex05();
	}
}
