package GUI_Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextField_ extends JFrame{
	
	public JTextField_() {
		setTitle("텍스트 영역 만들기 에제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		JTextField jf = new JTextField();
		c.add(jf);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	new JTextField_();	
	}

}
