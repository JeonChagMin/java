package 기본GUI연습문제;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D02 extends JFrame{
	
	D02() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		setLayout(new BorderLayout(5,7));
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		
		setSize(500,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new D02();
	}

}
