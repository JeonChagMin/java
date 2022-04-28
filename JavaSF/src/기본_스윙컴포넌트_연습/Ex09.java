package 기본_스윙컴포넌트_연습;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex09 extends JFrame {
	ImageIcon[] image = { new ImageIcon("images\\bo.jpg"), new ImageIcon("images\\gawi.jpg"),
			new ImageIcon("images\\bawi.jpg") };
	JButton[] btn = new JButton[3];
	JLabel me = new JLabel("me");
	JLabel com = new JLabel("com");
	JLabel result = new JLabel("Winner");

	public Ex09() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new Player(), BorderLayout.NORTH);
		c.add(new Enemy(), BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
	}

	class Player extends JPanel {
		Player() {
			setBackground(Color.GRAY);
			setLayout(new FlowLayout());
			for (int i = 0; i < btn.length; i++) {
				btn[i] = new JButton(image[i]);
				btn[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton) e.getSource();
						String w;
						int x = (int) (Math.random() * image.length);
						if (btn[0] == b) {
							if (x == 0) {
								w = "Same!!!";
								me.setIcon(image[0]);
								com.setIcon(image[x]);
								result.setText(w);

							} else if (x == 1) {
								w = "COMPUTER!!!";
								me.setIcon(image[0]);
								com.setIcon(image[x]);
								result.setText(w);
							} else if (x == 2) {
								w = "ME!!!";
								me.setIcon(image[0]);
								com.setIcon(image[x]);
								result.setText(w);
							}
						} else if (btn[1] == b) {
							if (x == 0) {
								w = "ME!!!";
								me.setIcon(image[1]);
								com.setIcon(image[0]);
								result.setText(w);
							} else if (x == 1) {
								w = "Same!!!";
								me.setIcon(image[1]);
								com.setIcon(image[x]);
								result.setText(w);
							} else if (x == 2) {
								w = "COMPUTER!!!";
								me.setIcon(image[1]);
								com.setIcon(image[x]);
								result.setText(w);
							}
						} else if (btn[2] == b) {
							if (x == 0) {
								w = "COMPUTER!!!";
								me.setIcon(image[2]);
								com.setIcon(image[x]);
								result.setText(w);
							} else if (x == 1) {
								w = "ME!!!";
								me.setIcon(image[2]);
								com.setIcon(image[x]);
								result.setText(w);
							} else if (x == 2) {
								w = "Same!!!";
								me.setIcon(image[2]);
								com.setIcon(image[x]);
								result.setText(w);
							}
						}
					}

				});
				add(btn[i]);

			}
		}
	}

	class Enemy extends JPanel {

		Enemy() {
			setBackground(Color.yellow);
			add(me);
			add(com);
			result.setForeground(Color.red);
			add(result);
		}
	}

	public static void main(String[] args) {
		new Ex09();
	}
}
