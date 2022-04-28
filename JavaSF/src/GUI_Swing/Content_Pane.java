package GUI_Swing;

import java.awt.*;
import javax.swing.*;

public class Content_Pane extends JFrame{
	Content_Pane() {
		setTitle("예제 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("Ok"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Content_Pane();

	}

}
