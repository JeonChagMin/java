package 기본GUI연습문제;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D04 extends JFrame{
	
	D04() {
		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
//		Color color[] = new Color[10];
		Color color[] = {Color.yellow,Color.cyan,Color.black,Color.DARK_GRAY,Color.green,Color.gray, Color.magenta,Color.orange,Color.pink,Color.red};
//		for (int i = 0; i < color.length; i++) {
//			color[i]=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
//		}
		for (int i = 0; i < 10; i++) {
			JButton[] btn = new JButton[10];
			btn[i]=new JButton(i+1+"");
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		
		
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new D04();
	}

}