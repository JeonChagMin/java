package 기본_스윙컴포넌트_연습;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex04 extends JFrame {
	String[] one = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	JTextField[] text = new JTextField[one.length];
	int x = 0;
	Checkbox[] check = new Checkbox[one.length - 1];

	public Ex04() {
		setTitle("Money Changer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		JLabel how = new JLabel("금액");
		how.setLocation(50, 10);
		how.setSize(30, 20);
		c.add(how);

		JTextField jf = new JTextField(10);
		JButton btn1 = new JButton("시작");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton) e.getSource();
				jf.setText("");
				text[0].setText("");
				text[1].setText("");
				text[2].setText("");
				text[3].setText("");
				text[4].setText("");
				text[5].setText("");
				text[6].setText("");
				text[7].setText("");
				btn1.setVisible(false);

			}
		});
		btn1.setLocation(280, 50);
		btn1.setSize(70, 20);
		c.add(btn1);
		btn1.setVisible(false);

		jf.setLocation(100, 10);
		jf.setSize(150, 20);
		c.add(jf);

		JButton btn = new JButton("계산");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb1 = (JButton) e.getSource();
				x = Integer.parseInt(jf.getText());
				text[0].setText("0");
				text[1].setText("0");
				text[2].setText("0");
				text[3].setText("0");
				text[4].setText("0");
				text[5].setText("0");
				text[6].setText("0");
				text[7].setText(x%10/1+"");
				btn1.setVisible(true);

			}
		});
		btn.setLocation(280, 10);
		btn.setSize(70, 20);
		c.add(btn);

		for (int i = 0; i < one.length; i++) {
			JLabel j = new JLabel(one[i]);
			j.setHorizontalAlignment(SwingConstants.RIGHT);
			j.setSize(50, 20);
			j.setLocation(70, 50 + i * 20);
			c.add(j);
			text[i] = new JTextField(7);
			text[i].setHorizontalAlignment(SwingConstants.CENTER);
			text[i].setSize(90, 20);
			text[i].setLocation(150, 50 + i * 20);
			c.add(text[i]);
		}

		for (int i = 0; i < check.length; i++) {
			check[i] = new Checkbox();
			check[i].setSize(20, 20);
			check[i].setLocation(250, 50 + i * 20);
			c.add(check[i]);
		}
		check[0].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[0].setText(x / 50000 + "");
				} else {
					text[0].setText("0");
				}

			}
		});

		check[1].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[1].setText(x / 10000 + "");
				} else {
					text[1].setText("0");
				}

			}
		});
		check[2].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[2].setText(x / 1000 + "");
				} else {
					text[2].setText("0");
				}

			}
		});
		check[3].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[3].setText(x / 500 + "");
				} else {
					text[3].setText("0");
				}

			}
		});
		check[4].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[4].setText(x / 100 + "");
				} else {
					text[4].setText("0");
				}

			}
		});
		check[5].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[5].setText(x / 50 + "");
				} else {
					text[5].setText("0");
				}

			}
		});
		check[6].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					text[6].setText(x / 10 + "");
				} else {
					text[6].setText("0");
				}

			}
		});

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}
}
