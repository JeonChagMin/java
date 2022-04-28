package 기본GUI연습문제;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class D계산기 extends JFrame {
	StringBuffer s = new StringBuffer();
	private JLabel jl;
	private int result;
	private JTextField jt;
	private JTextField jt1;

	D계산기() {
		setTitle("내가 만든 계산기 최종본");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new Center(), BorderLayout.CENTER);
		c.add(new South(), BorderLayout.SOUTH);
		c.add(new North(), BorderLayout.NORTH);

		setSize(500, 300);
		setVisible(true);

	}

	class Center extends JPanel {
		Center() {
			setLayout(new GridLayout(4, 4));
			for (int i = 0; i < 10; i++) {
				JButton j = new JButton(i + "");
				j.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton jb = (JButton) e.getSource();
						s.append(jb.getText());
						jt.setText(s+"");
					}
				});
				add(j);
			}

			JButton btn = new JButton("CE");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					s = null;
					s =new StringBuffer();
					jt1.setText("");
					jt.setText("");
				}
			});

			JButton btn1 = new JButton("=");
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					String nu = s.substring(0);
					for (int i = 0; i < nu.length(); i++) {
						if (nu.charAt(i) == '+') {
							int c = nu.indexOf("+");
							String a = nu.substring(0,c);
							String b = nu.substring(c+1);
							int x = Integer.parseInt(a);
							int y = Integer.parseInt(b);
							result = x + y;
							jt1.setText(String.valueOf(result));

						}
						if (nu.charAt(i) == '-') {
							int c = nu.indexOf("-");
							String a = nu.substring(0,c);
							String b = nu.substring(c+1);
							int x = Integer.parseInt(a);
							int y = Integer.parseInt(b);
							result = x - y;
							jt1.setText(String.valueOf(result));

						}
						if (nu.charAt(i) == 'X') {
							int c = nu.indexOf("X");
							String a = nu.substring(0,c);
							String b = nu.substring(c+1);
							int x = Integer.parseInt(a);
							int y = Integer.parseInt(b);
							result = x * y;
							jt1.setText(String.valueOf(result));

						}
						if (nu.charAt(i) == '/') {
							String a = nu.substring(0,nu.indexOf("/"));
							String b = nu.substring(nu.indexOf("+"+1));
							int x = Integer.parseInt(a);
							int y = Integer.parseInt(b);
							result = x / y;
							jt1.setText(String.valueOf(result));

						}
					}

				}
			});

			JButton btn2 = new JButton("+");
			btn2.setBackground(Color.cyan);
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					s.append(j.getText());
					jt.setText(s+"");

				}
			});

			JButton btn3 = new JButton("-");
			btn3.setBackground(Color.cyan);
			btn3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					s.append(j.getText());
					jt.setText(s+"");
				}
			});

			JButton btn4 = new JButton("X");
			btn4.setBackground(Color.cyan);
			btn4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					s.append(j.getText());
					jt.setText(s+"");
				}
			});

			JButton btn5 = new JButton("/");
			btn5.setBackground(Color.cyan);
			btn5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton j = (JButton) e.getSource();
					s.append(j.getText());
					jt.setText(s+"");
				}
			});

			add(btn);
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);
		}
	}

	class North extends JPanel {
		
		North() {
			setBackground(Color.white);
			setLayout(new FlowLayout());
			jl = new JLabel();
			JLabel j = new JLabel("입력");
			jt = new JTextField(20);
			add(j);
			add(jt);
		}
	}

	class South extends JPanel {
		
		South() {
			setBackground(Color.yellow);
			setLayout(new FlowLayout());
			JLabel j = new JLabel("결과");
			jl = new JLabel();
			jt1 = new JTextField(20);
			add(j);
			add(jt1);

		}
	}

	public static void main(String[] args) {
		new D계산기();

	}

}
