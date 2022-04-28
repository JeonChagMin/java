package 기본GUI연습문제;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class D05 extends JFrame {

	D05() {
		setTitle("4 * 4 Color Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));

		Color color[] = new Color[16];
		for (int i = 0; i < color.length; i++) {
			color[i] = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
		}
		for (int i = 0; i < 16; i++) {
			JButton[] btn = new JButton[16];
			btn[i] = new JButton(i + 1 + "");
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(500,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new D05();

	}

}
