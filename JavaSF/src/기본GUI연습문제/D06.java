package 기본GUI연습문제;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class D06 extends JFrame{
	
	D06() {
		setTitle("Random JLabels");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		for (int i = 0; i < 20; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			JLabel jlabel = new JLabel();
			jlabel.setLocation(x, y);
			jlabel.setSize(10,10);
			jlabel.setOpaque(true);
			jlabel.setBackground(Color.BLUE);;
			c.add(jlabel);
		}
		
		
		setSize(350,350);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new D06();

	}

}
