package GUI_Swing;

import java.awt.*;
import javax.swing.*;

public class Lay_Out extends JFrame {
	
	Lay_Out() {
		setTitle("예제 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("위"),BorderLayout.NORTH);
		c.add(new JButton("아래"),BorderLayout.SOUTH);
		c.add(new JButton("가운데"), BorderLayout.CENTER);
		c.add(new JButton("왼쪽"), BorderLayout.WEST);
		c.add(new JButton("오른쪽"), BorderLayout.EAST);
		

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Lay_Out();

	}

}
