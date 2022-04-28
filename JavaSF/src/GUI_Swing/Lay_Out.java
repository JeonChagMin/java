package GUI_Swing;

import java.awt.*;
import javax.swing.*;

public class Lay_Out extends JFrame {
	
	Lay_Out() {
		setTitle("���� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("��"),BorderLayout.NORTH);
		c.add(new JButton("�Ʒ�"),BorderLayout.SOUTH);
		c.add(new JButton("���"), BorderLayout.CENTER);
		c.add(new JButton("����"), BorderLayout.WEST);
		c.add(new JButton("������"), BorderLayout.EAST);
		

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Lay_Out();

	}

}
