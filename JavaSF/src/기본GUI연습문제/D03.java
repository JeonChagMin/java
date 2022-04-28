package 기본GUI연습문제;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D03 extends JFrame{
	
	D03() {
		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for (int i = 0; i < 10; i++) {
			c.add(new JButton(i+1+""));
		}
		
		
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new D03();
	}

}
