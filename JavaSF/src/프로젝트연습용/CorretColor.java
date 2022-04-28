package 프로젝트연습용;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CorretColor extends JFrame {

	Color[] color = { Color.white, Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.CYAN };
	Color imsi = Color.black;
	int i = 1;

	CorretColor() {
		setTitle("색깔 맞추기 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 4));

		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn1 = new JButton();
		btn1.setBackground(color[0]);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn1.setBackground(color[i]);
					i++;
				} else {
					btn1.setBackground(color[i]);
					i++;
				}

			}
		});

		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}
		
		JButton btn2 = new JButton();
		btn2.setBackground(color[0]);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn2.setBackground(color[i]);
					i++;
				} else {
					btn2.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn3 = new JButton();
		btn3.setBackground(color[0]);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn3.setBackground(color[i]);
					i++;
				} else {
					btn3.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn4 = new JButton();
		btn4.setBackground(color[0]);
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn4.setBackground(color[i]);
					i++;
				} else {
					btn4.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn5 = new JButton();
		btn5.setBackground(color[0]);
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn5.setBackground(color[i]);
					i++;
				} else {
					btn5.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn6 = new JButton();
		btn6.setBackground(color[0]);
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn6.setBackground(color[i]);
					i++;
				} else {
					btn6.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn7 = new JButton();
		btn7.setBackground(color[0]);
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn7.setBackground(color[i]);
					i++;
				} else {
					btn7.setBackground(color[i]);
					i++;
				}

			}
		});
		
		for (int i = 0; i < color.length; i++) {
			int start = (int) (Math.random() * color.length);
			int end = (int) (Math.random() * color.length);
			imsi = color[start];
			color[start] = color[end];
			color[end] = imsi;
		}

		JButton btn8 = new JButton();
		btn8.setBackground(color[0]);
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= color.length) {
					i = 0;
					btn8.setBackground(color[i]);
					i++;
				} else {
					btn8.setBackground(color[i]);
					i++;
				}

			}
		});

		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);

		setSize(500, 300);
		setVisible(true);
	}


	public static void main(String[] args) {
		new CorretColor();

	}
}
